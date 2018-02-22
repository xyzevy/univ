create or replace procedure three_v2(dvsid device.deviceid%type,
  money payfee.paymoney%type,old_ser payfee.bankserial%type,
  res out varchar2) is
  
  pay_id payfee.id%type;
  bkcode payfee.bankcode%type;
  serial payfee.bankserial%type;
  
  not_found_exception exception;
  time_out_exception exception;
  
  cursor cur_p is
    select * from payfee where bankserial=old_ser and paymoney=money;
  pf cur_p%rowtype;
  
begin
  open cur_p;
  loop
    fetch cur_p into pf;
    exit when cur_p%notfound;
    dbms_output.put_line('----------------------------------------');
    dbms_output.put_line('�ɷѱ�ţ�'||pf.id);
    dbms_output.put_line('�豸��ţ�'||pf.deviceid);
    dbms_output.put_line('�ɷѽ�'||pf.paymoney);
    dbms_output.put_line('�ɷ����ڣ�'||pf.paydate);
    dbms_output.put_line('���д��룺'||pf.bankcode);
    dbms_output.put_line('�ɷ����ͣ�'||pf.type);
    dbms_output.put_line('������ˮ��'||pf.bankserial);
    dbms_output.put_line('----------------------------------------');
  end loop;
  
  if pf.id is null then
    raise not_found_exception;
  end if;
  
  if sysdate-pf.paydate>=1 then
    raise time_out_exception;
  end if;
  
    select max(id)+1 into pay_id from payfee;
  if pay_id is null then 
    pay_id:=1;
  end if;
  
  --select distinct bankcode into bkcode from payfee 
  --  where deviceid=dvsid and rownum<2 order by id desc;
  if bkcode is null then
    select bank.code into bkcode from bank where bank.name='��������';
  end if;
  
  serial:='ZS'||to_char(sysdate,'yyyymmdd')||lpad(to_char(pay_id),'6','0');
  
  update device set balance=balance-to_number(money) where deviceid=dvsid;
  
  insert into bankrecord values(pay_id,-money,bkcode,serial);
  
  insert into payfee values(pay_id,dvsid,-money,sysdate,bkcode,'2002',serial);
  dbms_output.put_line('�ɷ���Ϣ:'||pay_id||'_'||dvsid||'_'||-money||'_'||sysdate||'_'
    ||bkcode||'_'||'2002'||'_'||serial);
   
  res:='�ɹ�';
  commit;
exception
  when not_found_exception then
    dbms_output.put_line('��Ϣ�����޷�������');
    res:='ʧ��';
  when time_out_exception then
    dbms_output.put_line('���󣺳�������ʱ�䣡');
    res:='ʧ��';
end three_v2;
/