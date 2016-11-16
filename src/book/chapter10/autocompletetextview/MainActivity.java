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
		
		//要想达到自动提示的效果，必须定义一个数据源。
		String[]books=new String[]{
				"Android开发案例驱动教程","Android平台开发之旅","Android揭秘","Android从零开始","疯狂Android讲义"
		};
		
		//借助Adapter关联数据显示和数据源
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,books);
	
		//将Adapter对象与列表控件关联起来
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
