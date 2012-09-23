package com.sweng.ffa;

import com.sun.jersey.spi.service.ServiceFinder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

import edu.psu.sweng.ff.client.Members;

public class LoginActivity extends Activity {
	
	private EditText etUsername;
	private EditText etPassword;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findControls();
        ServiceFinder.setIteratorProvider(new AndroidServiceIteratorProvider());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_login, menu);
        return true;
    }
    
    public void findControls() {
    	etUsername = (EditText)findViewById(R.id.etUsername);
    	etPassword = (EditText)findViewById(R.id.etPassword);
    }
    
    public void onClickLogin(View view) {
    	System.out.println("Login Reached.");    	
    	String username = etUsername.getText().toString();
    	String password = etPassword.getText().toString();
    	System.out.println("Username: " + username);
    	System.out.println("Password: " + password);
    	
    	String token = Members.authenticate(username, password);
    	System.out.println(token);
    }
    
    public void onClickRegister(View view) {
    	Intent registerScreen = new Intent(getApplicationContext(), RegisterActivity.class);
    	startActivity(registerScreen);
    }
}
