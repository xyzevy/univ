//package com.i4evercai.bannerdemo;
//
//import android.app.Activity;
//import android.content.Context;
//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.os.Handler;
//import android.os.Message;
//import android.widget.ListView;
//import android.widget.Toast;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.PrintStream;
//import java.io.UnsupportedEncodingException;
//import java.util.LinkedList;
//import java.util.List;
//
//import com.i4evercai.bannerdemo.ui.OrderlistAdapter;
//
//public class ShowOrder_2 extends Activity {	
//    private List<OrderItem> orderItems=null;
//    private OrderlistAdapter orderlistAdapter = null;
//    private Context context;
//    private ListView orderlistView;
//    private Myapplication app;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_showorder);
//        
//        OrderContainer oc=new OrderContainer();
//        
//        orderItems=new LinkedList<OrderItem>();
////        app=(Myapplication) getApplication();
//        Intent intent=getIntent();
//        
//        
//        String orderstr=intent.getStringExtra("orders");
//        new test(orderstr).start();
//        //String str=intent.getStringExtra("judge");
//        
//
//		Toast.makeText(ShowOrder_2.this,orderstr,Toast.LENGTH_SHORT).show();
//        
//        orderlistView=(ListView)findViewById(R.id.myOrderlist);
//        List<OrderItem> orders=oc.deString(orderstr);
//       
//        
//         context=ShowOrder_2.this;
//        orderlistAdapter=new OrderlistAdapter((LinkedList<OrderItem>) orderItems,context);
//        orderlistView.setAdapter(orderlistAdapter);
////        orderItems.clear();
///*
////        OrderItem tempItme=new OrderItem();
////        tempItme.setCost(5000);
////        tempItme.setCompany("zxsdfkjds");
////        tempItme.setServiceType("kzdjsfgj");
////        tempItme.setFlag(3);
////        app.getOrderList().add(tempItme);
//
////        for(int i=0;i<app.getOrderList().size();i++)
////        {
////            if(Integer.parseInt(str)==6)
////            {
////                orderItems.add(app.getOrderList().get(i));
////                continue;
////            }
////            if(app.getOrderList().get(i).getFlag()== Integer.parseInt(str))
////            {
////                orderItems.add(app.getOrderList().get(i));
////            }
////        }
//        
//        orderlistAdapter.notifyDataSetChanged();
//        */
//    }
//    
//    class test extends Thread{
//		String str;
//		public test(String s){
//			this.str=s;
//		}
//		
//		public void run(){
//			//s=Client.getSocket();
//			try {
//				PrintStream writer=Client.getWriter();
//				BufferedReader reader=Client.getReader();	
//				writer.println("test#"+str);
//				String orders=reader.readLine();
//			} catch (UnsupportedEncodingException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}		
//	}
//    
//}
