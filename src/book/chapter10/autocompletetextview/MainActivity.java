package book.chapter10.autocompletetextview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {

	private AutoCompleteTextView myAuto;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Ҫ��ﵽ�Զ���ʾ��Ч�������붨��һ������Դ��
		String[]books=new String[]{
				"Android�������������̳�","Androidƽ̨����֮��","Android����","Android���㿪ʼ","���Android����"
		};
		
		//����Adapter����������ʾ������Դ
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,books);
	
		//��Adapter�������б�ؼ���������
		myAuto=(AutoCompleteTextView)this.findViewById(R.id.myAuto);
		myAuto.setAdapter(adapter);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
