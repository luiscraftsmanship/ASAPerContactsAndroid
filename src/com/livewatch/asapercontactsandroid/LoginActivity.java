package com.livewatch.asapercontactsandroid;

//import com.livewatch.asaperandroidinterfacev3.CreateProfileActivity;
//import com.livewatch.asaperandroidinterfacev3.LoginActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;


public class LoginActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_layout);

	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	/*public void sendLoginActivity(View view) {
	    Intent intent = new Intent(this, MessageASAPerActivity.class);
	    startActivity(intent);
	}
	
	public void sendSignupActivity(View view) {
	    Intent intent = new Intent(this, HomeActivity.class);
	    startActivity(intent);
	}*/


}
