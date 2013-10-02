package com.livewatch.asapercontactsandroid;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;

public class SelectContactsActivity extends SherlockActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
    	 
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_contacts_layout);
        
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM); 
		getSupportActionBar().setCustomView(R.layout.select_contacts_menu);
		
		//getSupportActionBar().setIcon(R.drawable.menu_highlighted );
        //getSupportActionBar().setHomeButtonEnabled(true);
        //getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setBackgroundDrawable(
        		new ColorDrawable(Color.parseColor("#38393B")));
    }
 
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	
    	MenuInflater inflater = getSupportMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    
    
    /*public void clickButtonSendFeedback(View view) {
	    Intent intent = new Intent(this, SendFeedbackActivity.class);
	    startActivity(intent);
	}*/
    
    public void onClickImportContacts(View view) {
	    Intent intent = new Intent(this, ContactListActivity.class);
	    startActivity(intent);
	}
	
	/*public void onClickCreateGroup(View view) {
	    Intent intent = new Intent(this, GroupsActivity.class);
	    startActivity(intent);
	}*/

 
}
