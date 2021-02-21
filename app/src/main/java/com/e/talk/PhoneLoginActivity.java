package com.e.talk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.hbb20.CountryCodePicker;

import java.util.concurrent.TimeUnit;

public class PhoneLoginActivity extends AppCompatActivity {

   // private CountryCodePicker ccp;
   // private Button SendVerificationCodeButton , VerifyButton;
  //  private EditText InputPhoneNumber,InputVerificationCode;
 //   private PhoneAuthProvider.OnVerificationStateChangedCallbacks callbacks;
 //   private String mVerificationId;
 //   private String phoneNumber="";
 //   private FirebaseAuth mAuth;
  //  private PhoneAuthProvider.ForceResendingToken mResendToken;
  //  private ProgressDialog loadingBar;
  //  private RelativeLayout relativeLayout;

 //   @Override
 //   protected void onCreate(Bundle savedInstanceState) {

   //     super.onCreate(savedInstanceState);
    //    setContentView(R.layout.activity_phone_login);
    //    mAuth = FirebaseAuth.getInstance();
    //    ccp =(CountryCodePicker) findViewById(R.id.ccp);
    //    ccp.registerCarrierNumberEditText(InputPhoneNumber);
    //    relativeLayout = findViewById(R.id.phoneAuth);


      //  SendVerificationCodeButton =(Button) findViewById(R.id.send_verification_code_button);
     //   VerifyButton =(Button) findViewById(R.id.verify_button);
    //    InputPhoneNumber=(EditText) findViewById(R.id.phone_number_input);
   //     InputVerificationCode=(EditText) findViewById(R.id.verification_code_input);
   //     loadingBar= new ProgressDialog(this);



   //     SendVerificationCodeButton.setOnClickListener(new View.OnClickListener() {
 //           @Override
   //         public void onClick(View view)
     //       {



        //        String  phoneNumber = InputPhoneNumber.getText().toString();
          //      if (TextUtils.isEmpty(phoneNumber))
         //       {
          //          Toast.makeText(PhoneLoginActivity.this, "please enter your phone number first", Toast.LENGTH_SHORT).show();
          //      }
          //      else
        //        {
       //             phoneNumber = ccp.getFullNumberWithPlus();

             //       loadingBar.setTitle("Phone Verification");
            //        loadingBar.setMessage("please wait while we are making a chatting room for you...");
            //        loadingBar.setCanceledOnTouchOutside(false);
           //        loadingBar.show();

           ///         PhoneAuthProvider.getInstance().verifyPhoneNumber(
              //              phoneNumber,        // Phone number to verify
                //            60,                 // Timeout duration
                  //          TimeUnit.SECONDS,   // Unit of timeout
                    //        PhoneLoginActivity.this,               // Activity (for callback binding)
                      //      callbacks);        // OnVerificationStateChangedCallbacks
     //           }

       //     }
 //       });

   //     VerifyButton.setOnClickListener(new View.OnClickListener() {
     //       @Override
    //        public void onClick(View view)
      //      {
    //            SendVerificationCodeButton.setVisibility(View.INVISIBLE);
      ///          InputPhoneNumber.setVisibility(View.INVISIBLE);

            //    String verificationCode = InputVerificationCode.getText().toString();

         //       if (TextUtils.isEmpty(verificationCode))
           ///     {
              //      Toast.makeText(PhoneLoginActivity.this, " please write fast", Toast.LENGTH_SHORT).show();
              ////  }else
   //             {
     //               loadingBar.setTitle("Code Verification");
   //                 loadingBar.setMessage("please wait while we verify the code...");
     //               loadingBar.setCanceledOnTouchOutside(false);
       //             loadingBar.show();


         //           PhoneAuthCredential credential = PhoneAuthProvider.getCredential(mVerificationId, verificationCode);
           //         signInWithPhoneAuthCredential(credential);

 //               }

   //         }
    ///    });


     //     callbacks = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
       //       @Override
         //     public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential)
           //   {
             //     signInWithPhoneAuthCredential(phoneAuthCredential);
       //       }

         //     @Override
           ////   public void onVerificationFailed(@NonNull FirebaseException e)
    //          {
      //            loadingBar.dismiss();
        //          Toast.makeText(PhoneLoginActivity.this, " Inavlid please enter correct phone number with country code", Toast.LENGTH_SHORT).show();


          //        SendVerificationCodeButton.setVisibility(View.VISIBLE);
            //      InputPhoneNumber.setVisibility(View.VISIBLE);
//
  //                VerifyButton.setVisibility(View.INVISIBLE);
 //                 InputVerificationCode.setVisibility(View.INVISIBLE);
//
  //            }
     //         public void onCodeSent( String verificationId,
       //                               PhoneAuthProvider.ForceResendingToken token)
         //     {
           //       mVerificationId = verificationId;
             //     mResendToken = token;

               //   loadingBar.dismiss();


  //                Toast.makeText(PhoneLoginActivity.this, " code has been sent to you", Toast.LENGTH_SHORT).show();


    //              SendVerificationCodeButton.setVisibility(View.INVISIBLE);
      //            InputPhoneNumber.setVisibility(View.INVISIBLE);

  //                VerifyButton.setVisibility(View.VISIBLE);
         //         InputVerificationCode.setVisibility(View.VISIBLE);


//              }

  //        };
//




  //  }
 //   private void signInWithPhoneAuthCredential(PhoneAuthCredential credential) {
    //    mAuth.signInWithCredential(credential)
      //          .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
        //            @Override
           //         public void onComplete(@NonNull Task<AuthResult> task) {
             //           if (task.isSuccessful())
               //         {
                 //           loadingBar.dismiss();
                   //         Toast.makeText(PhoneLoginActivity.this, " congratulation you are logged in succesfully...", Toast.LENGTH_SHORT).show();
                     //       SendUserToMainActivity();

                       // }
                    //    else
                      //      {
                        //        String message = task.getException().toString();
                          //      Toast.makeText(PhoneLoginActivity.this, "Error:" + message, Toast.LENGTH_SHORT).show();
             //               }
               //         }

      //          });
   // }

  //  private void SendUserToMainActivity()
  //  {

//        Intent mainIntent=new Intent(PhoneLoginActivity.this,MainActivity.class);
   //     startActivity(mainIntent);
   //     finish();

//    }
//}

///////iske baad see

    private CountryCodePicker ccp;
    private EditText phoneText;
    private EditText codeText;
    private Button continueAndNextBtn;
    private  String checker = "",phoneNumber ="";
    private RelativeLayout relativeLayout;
    private PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallbacks;
    private FirebaseAuth mAuth;
    private  String mVerificationId;
    private PhoneAuthProvider.ForceResendingToken mResendToken;
    private ProgressDialog  loadingBar;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_login);

        mAuth = FirebaseAuth.getInstance();
        loadingBar = new ProgressDialog(this);




        phoneText = findViewById(R.id.phoneText);
        codeText = findViewById(R.id.codeText);
        continueAndNextBtn = findViewById(R.id.continueNextButton);
        relativeLayout = findViewById(R.id.phoneAuth);
        ccp =(CountryCodePicker) findViewById(R.id.ccp);
        ccp.registerCarrierNumberEditText(phoneText);

        continueAndNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (continueAndNextBtn.getText().equals("submit")|| checker.equals("Code Sent"))
                {
                    String verificationCode= codeText.getText().toString();
                    if (verificationCode.equals(""))
                    {
                        Toast.makeText(PhoneLoginActivity.this, "plz write the verification code", Toast.LENGTH_SHORT).show();

                    }
                    else
                    {
                        loadingBar.setTitle("code verification");
                        loadingBar.setMessage("please wait while we are verifying your code");
                        loadingBar.setCanceledOnTouchOutside(false);
                        loadingBar.show();
                        PhoneAuthCredential credential = PhoneAuthProvider.getCredential(mVerificationId,verificationCode);
                        signInWithPhoneAuthCredential(credential);

                    }

                }else
                {
                    phoneNumber = ccp.getFullNumberWithPlus();
                    if (!phoneNumber.equals(""))
                    {
                        loadingBar.setTitle("phone number verification");
                        loadingBar.setMessage("please wait while we are verifying your phone number");
                        loadingBar.setCanceledOnTouchOutside(false);
                        loadingBar.show();
                        PhoneAuthProvider.getInstance().verifyPhoneNumber(phoneNumber,60,TimeUnit.SECONDS,PhoneLoginActivity.this,mCallbacks);

                    }else
                    {
                        Toast.makeText(PhoneLoginActivity.this, "please write the valid  code ", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

        mCallbacks = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
            @Override
            public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential)
            {
                signInWithPhoneAuthCredential(phoneAuthCredential);

            }

            @Override
            public void onVerificationFailed(FirebaseException e)
            {
                Toast.makeText(PhoneLoginActivity.this, " your number is invalid", Toast.LENGTH_SHORT).show();
                loadingBar.dismiss();
                relativeLayout.setVisibility(View.VISIBLE);
                continueAndNextBtn.setText("Continue");
                codeText.setVisibility(View.GONE);

            }

            @Override
            public void onCodeSent(String s, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                super.onCodeSent(s, forceResendingToken);
                mVerificationId = s;
                mResendToken = forceResendingToken;

                relativeLayout.setVisibility(View.GONE);
                checker ="Code Sent";
                continueAndNextBtn.setText("Submit");
                codeText.setVisibility(View.VISIBLE);
                loadingBar.dismiss();
                Toast.makeText(PhoneLoginActivity.this, "the code has been sent to you plz check", Toast.LENGTH_SHORT).show();
            }
        };
    }

    private void signInWithPhoneAuthCredential(PhoneAuthCredential credential) {
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful())
                        {
                            loadingBar.dismiss();
                            Toast.makeText(PhoneLoginActivity.this,"Congratulations , you are logged in successfully",Toast.LENGTH_SHORT).show();
                            sendUserToMainActivity();
                        } else
                        {

                            loadingBar.dismiss();
                            String e = task.getException().toString();
                            Toast.makeText(PhoneLoginActivity.this, "Error:"+ e, Toast.LENGTH_SHORT).show();

                        }

                    }

                });

    }
    private  void sendUserToMainActivity()
    {
        Intent intent = new Intent(PhoneLoginActivity.this,MainActivity.class);
        startActivity(intent);
        finish();


    }
}



