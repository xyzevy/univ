//package com.i4evercai.bannerdemo;
//
//
//import android.app.Activity;
//import android.content.Context;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.graphics.Color;
//import android.content.Intent;
//import android.os.Bundle;
//import android.os.Handler;
//import android.os.Message;
//import android.util.Log;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.view.View;
//import android.view.View.OnClickListener;
//import android.widget.ImageView;
//import android.widget.LinearLayout;
//import android.widget.ListView;
//import android.widget.Spinner;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.PrintStream;
//import java.io.UnsupportedEncodingException;
//
//public class Vip_2 extends Activity {
//	//private MyDataBaseHelper dbHelper;
//	private Myapplication app;
//
//
//	Handler handler,handler2;
//	private int state[]=new int[5];
//
//    BadgeView bv[]=new BadgeView[5];
//
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_vip);
//		TextView newsview=(TextView)findViewById(R.id.newsTextView);
//		TextView questionview=(TextView)findViewById(R.id.questionTextView);
//		TextView serviceview=(TextView)findViewById(R.id.serviceTextView);
//		TextView starview=(TextView)findViewById(R.id.starTextView);
//		TextView lefTime=(TextView)findViewById(R.id.leftTime);
//
//		app=(Myapplication) getApplication();
//		lefTime.setText("您还剩余"+app.getTimes()+"次免费服务");
//
//		newsview.setOnClickListener(new OnClickListener(){
//			public void onClick(View v)
//			{
//				Intent intent=new Intent(Vip_2.this,MainActivity.class);
//				startActivity(intent);
//				overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
//
//				//Toast.makeText(MainActivity.this,"点击成功2",Toast.LENGTH_SHORT).show();
//			}
//		});
//		
//		questionview.setOnClickListener(new OnClickListener(){
//			public void onClick(View v)
//			{
//				Intent intent=new Intent(Vip_2.this,Question.class);
//				//Toast.makeText(MainActivity.this,"点击成功3",Toast.LENGTH_SHORT).show();
//				startActivity(intent);
//				overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
//			}
//		});	
//		serviceview.setOnClickListener(new OnClickListener(){
//			public void onClick(View v)
//			{
//				Intent intent=new Intent(Vip_2.this,Service.class);
//				startActivity(intent);
//				overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
//				//Toast.makeText(MainActivity.this,"点击成功4",Toast.LENGTH_SHORT).show();
//			}
//		});
//		
//		LinearLayout applyfor=(LinearLayout)findViewById(R.id.apply);
//		applyfor.setOnClickListener(new LinearLayout.OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				Log.i("click", "on create order");
//				Intent intent=new Intent(Vip_2.this,Order.class);
//				startActivity(intent);
//				
//			}
//		});
//		
//		ImageView img1=(ImageView)findViewById(R.id.picture1);
//		ImageView img2=(ImageView)findViewById(R.id.picture2);
//		ImageView img3=(ImageView)findViewById(R.id.picture3);
//		ImageView img4=(ImageView)findViewById(R.id.picture4);
//		ImageView img5=(ImageView)findViewById(R.id.picture5);	
//		
////		ImageView img[]=new ImageView[5];
////		img[0]=(ImageView)findViewById(R.id.picture1);
////		img[1]=(ImageView)findViewById(R.id.picture2);
////		img[2]=(ImageView)findViewById(R.id.picture3);
////		img[3]=(ImageView)findViewById(R.id.picture4);
////		img[4]=(ImageView)findViewById(R.id.picture5);
//		
//		
//		
//
//		bv[0]=new BadgeView(this,(ImageView)findViewById(R.id.picture1));
//		bv[1]=new BadgeView(this,(ImageView)findViewById(R.id.picture2));
//		bv[2]=new BadgeView(this,(ImageView)findViewById(R.id.picture3));
//		bv[3]=new BadgeView(this,(ImageView)findViewById(R.id.picture4));
//		bv[4]=new BadgeView(this,(ImageView)findViewById(R.id.picture5));
//		
//
//		handler=new Handler(){
//			public void handleMessage(Message msg){
//				super.handleMessage(msg);
//				String states=msg.getData().getString("state");
//				
//				for(int i=0;i<5;i++){
//					state[i]=Integer.parseInt(states.split("#")[1].split("_")[i]);
//				}
//				badgeAll();
//			}
//		};
//		
//		new getState().start();
//		//new getOrders(1,6).start();
//		
//		
//		
//		
//		app.getOrderList();//鍒ゆ柇璁㈠崟姝ゆ椂鐨勭姸鎬�
//		
////		img1.setEnabled(false);//鍒濆鍖栦负閮戒笉鍙偣鍑�
////		img2.setEnabled(false);
////		img3.setEnabled(false);
////		img4.setEnabled(false);
////		img5.setEnabled(false);
//		
//		
////		for(int i=0;i<5;i++){
////			//img[i].setEnabled(false);
////			
////			if(state[i]!=0){
////				img[i].setEnabled(true);
////			}
////		}
//		
//		for(int i=0;i<app.getOrderList().size();i++)
//		{//鍒ゆ柇璁㈠崟鐘舵��
//			if(app.getOrderList().get(i).getFlag()==1)
//			{
//				//img[1].setEnabled(true);
//				img1.setEnabled(true);
//			}
//			if(app.getOrderList().get(i).getFlag()==2)
//			{
//				//img[2].setEnabled(true);
//				img2.setEnabled(true);
//			}
//			if(app.getOrderList().get(i).getFlag()==3)
//			{
//				//img[3].setEnabled(true);
//				img3.setEnabled(true);
//			}
//			if(app.getOrderList().get(i).getFlag()==4)
//			{
//				//img[4].setEnabled(true);
//				img4.setEnabled(true);
//			}
//			if(app.getOrderList().get(i).getFlag()==5)
//			{
//				img5.setEnabled(true);
//				//img[5].setEnabled(true);
//			}
//		}
//		img1.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//
//				// TODO 自动生成的方法存根
//				Toast.makeText(Vip_2.this,"有订单未支付",Toast.LENGTH_SHORT).show();
//				Intent intent=new Intent(Vip_2.this,ShowOrder.class);
//				intent.putExtra("judge","1");
//				//new getOrders(1,1).start();;
//				
//				startActivity(intent);
//				
//			}
//		});
//		img2.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				// TODO 自动生成的方法存根
//				Toast.makeText(Vip_2.this,"有订单未处理",Toast.LENGTH_SHORT).show();
//				Intent intent=new Intent(Vip_2.this,ShowOrder.class);
//				intent.putExtra("judge","2");
//				//new getOrders(2,2).start();
//				
//				startActivity(intent);
//				
//			}
//		});
//		img3.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				// TODO 自动生成的方法存根
//				Toast.makeText(Vip_2.this,"有订单已处理",Toast.LENGTH_SHORT).show();
//				Intent intent=new Intent(Vip_2.this,ShowOrder.class);
//				intent.putExtra("judge","3");
//				//new getOrders(3,3).start();
//				startActivity(intent);
//				
//			}
//		});
//		img4.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				// TODO 自动生成的方法存根
//				Toast.makeText(Vip_2.this,"有订单待评价",Toast.LENGTH_SHORT).show();
//				Intent intent=new Intent(Vip_2.this,ShowOrder.class);
//				intent.putExtra("judge",4);
//				//new getOrders(4,4).start();
//				
//				startActivity(intent);
//				
//			}
//		});
//		img5.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				// TODO 自动生成的方法存根
//				Toast.makeText(Vip_2.this,"有退款订单",Toast.LENGTH_SHORT).show();
//				Intent intent=new Intent(Vip_2.this,ShowOrder.class);
//				intent.putExtra("judge","5");
//				//new getOrders(5,5).start();
//				
//				startActivity(intent);
//				
//			}
//		});
//		
//		
//		//灞曠ず鎴戠殑璁㈠崟*/
//		LinearLayout myOrder=(LinearLayout)findViewById(R.id.myOrder);
//		myOrder.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				// TODO 鑷姩鐢熸垚鐨勬柟娉曞瓨鏍�
//				//璺宠浆鍒板睍绀烘墍鏈夎鍗曠姸鎬佺殑椤甸潰
//
//				Intent intent=new Intent(Vip_2.this,ShowOrder.class);
//				intent.putExtra("judge","6");
//				//new getOrders(1,6).start();
//				
//				startActivity(intent);
//			}
//		});
//		
//		handler2=new Handler(){
//			public void handleMessage(Message msg){
//				super.handleMessage(msg);
//				String orders=msg.getData().getString("orders");
//					
//				OrderContainer oc=new OrderContainer();
//				app.toList(oc.deString(orders));
//				
//				Toast.makeText(Vip_2.this,orders,Toast.LENGTH_SHORT).show();
//
////				Intent intent=new Intent(Vip.this,ShowOrder_2.class);
////				intent.putExtra("orders",orders);
////				startActivity(intent);			
//			}
//		};
//		
//	}
//	
//
//	public void badgeAll(){
//		for(int i=0;i<5;i++)
//			badge(bv[i],state[i]);
//	}
//	public void badge(BadgeView bv,int num){
//		if(num!=0){		
//		    bv.setText(""+num);  	      
//		    bv.setTextColor(Color.YELLOW);  	      
//		    bv.setTextSize(15);
//		    bv.setBadgePosition(BadgeView.POSITION_TOP_RIGHT); //默认值  	      
//		    bv.show();
//		}else{			
//	    	bv.setText(null);
//	    	bv.hide();
//		}
//	}
//	
//
//	class getState extends Thread{
//		public void run(){
//			//s=Client.getSocket();
//			try {
//				PrintStream writer=Client.getWriter();
//				BufferedReader reader=Client.getReader();	
//				writer.println("getstate#"+app.getUser());
//				String states=reader.readLine();
//				
////				if(states!=null){
////					Bundle b=new Bundle();
////					b.putString("state", states);
////					Message msg=Message.obtain();
////					msg.setData(b);
////					handler.sendMessage(msg);
////				}
//				
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
//
//	class getOrders extends Thread{
//		int min;
//		int max;
//		
//		public getOrders(int min,int max){
//			this.min=min;
//			this.max=max;
//		}
//		
//		public void run(){
//			//s=Client.getSocket();
//			try {
//				PrintStream writer=Client.getWriter();
//				BufferedReader reader=Client.getReader();	
//				writer.println("getorders#"+app.getUser()+"_"+min+"_"+max);
//				String orders=reader.readLine();
//				
//				if(!orders.equals("")){
//
//					Bundle b=new Bundle();
//					b.putString("orders", orders.split("#")[1]);
//					Message msg=Message.obtain();
//					msg.setData(b);
//					handler2.sendMessage(msg);
//				}
//				
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
