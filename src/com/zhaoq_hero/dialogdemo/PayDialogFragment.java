package com.zhaoq_hero.dialogdemo;


import android.annotation.SuppressLint;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/**
 * 自定义  dialog警告框   弹出后  用于用户选择需要  的支付方式：
 * @author hl
 * zhaoq_hero@163.com
 */
@SuppressLint("NewApi")
public class PayDialogFragment extends DialogFragment {
	
	/**
	 * 用volatile修饰的变量 
	 * 线程在每次使用变量的时候  都会读取变量修改后的值
	 * volatile用来进行原子性操作
	 */
	private static volatile PayDialogFragment dialog = null;
	
//	//私有化构造参数：
	private PayDialogFragment(){}

	/**
	 * 单例模式创建  对象
	 * @return dialog
	 */
	public static PayDialogFragment getInstance(){
		
		if(dialog==null){
			synchronized(PayDialogFragment.class){
				if(dialog==null){
					dialog = new PayDialogFragment();
				}
			}
		}
		return dialog;
	}
	
	
	/*
	 * 使用 onCreateView()
	 */
	@Override  
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  
        Bundle savedInstanceState) {  
        /** 
         * 先设置   无标题样式的  对话框 
         */  
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);  
          
        View view = inflater.inflate(R.layout.pay_dialog_fragment, container,false);  
          
        return view;  
    }  
	

}
