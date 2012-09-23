package com.sweng.ffa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends Activity {
	
	private EditText etUsername;
	private EditText etPassword;
	private EditText etConfirmPassword;
	private EditText etFirstName;
	private EditText etLastName;
	private EditText etEmail;
	private EditText etMobile;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        findControls();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_register, menu);
        return true;
    }
    
    public void findControls() {
    	etUsername = (EditText)findViewById(R.id.etUsername);
    	etPassword = (EditText)findViewById(R.id.etPassword);
    	etConfirmPassword = (EditText)findViewById(R.id.etConfirmPassword);
    	etFirstName = (EditText)findViewById(R.id.etFirstName);
    	etLastName = (EditText)findViewById(R.id.etLastName);
    	etEmail = (EditText)findViewById(R.id.etEmail);
    	etMobile = (EditText)findViewById(R.id.etMobile);
    }
    
    public void save(View view) {
    	System.out.println("Save Reached.");
    	String username = etUsername.getText().toString();
    	String password = etPassword.getText().toString();
    	String confirmPassword = etConfirmPassword.getText().toString();
    	String firstName = etFirstName.getText().toString();
    	String lastName = etLastName.getText().toString();
    	String email = etEmail.getText().toString();
    	String mobile = etMobile.getText().toString();
    	System.out.println("Username: " + username);
    	System.out.println("Password: " + password);
    	System.out.println("Confirmed Password: " + confirmPassword);
    	System.out.println("First Name: " + firstName);
    	System.out.println("Last Name: " + lastName);
    	System.out.println("Email: " + email);
    	System.out.println("Mobile: " + mobile);
    }
    
    public void cancel(View view) {
    	Intent loginScreen = new Intent(getApplicationContext(), LoginActivity.class);
    	startActivity(loginScreen);
    }
}
