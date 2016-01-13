package com.zhaoq_hero.dialogdemo;


import android.annotation.SuppressLint;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/**
 * �Զ���  dialog�����   ������  �����û�ѡ����Ҫ  ��֧����ʽ��
 * @author hl
 * zhaoq_hero@163.com
 */
@SuppressLint("NewApi")
public class PayDialogFragment extends DialogFragment {
	
	/**
	 * ��volatile���εı��� 
	 * �߳���ÿ��ʹ�ñ�����ʱ��  �����ȡ�����޸ĺ��ֵ
	 * volatile��������ԭ���Բ���
	 */
	private static volatile PayDialogFragment dialog = null;
	
//	//˽�л����������
	private PayDialogFragment(){}

	/**
	 * ����ģʽ����  ����
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
	 * ʹ�� onCreateView()
	 */
	@Override  
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  
        Bundle savedInstanceState) {  
        /** 
         * ������   �ޱ�����ʽ��  �Ի��� 
         */  
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);  
          
        View view = inflater.inflate(R.layout.pay_dialog_fragment, container,false);  
          
        return view;  
    }  
	

}
