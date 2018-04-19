package com.example.android.quizappmain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    ArrayList<Question> questions = new ArrayList<>( );
    ArrayList<String> selectedOptionArray;

    RadioGroup question1, question2, question3;
    CheckBox question4CheckboxOption1;
    CheckBox question4CheckboxOption2;
    CheckBox question4CheckboxOption3;
    CheckBox question4CheckboxOption4;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        questions = loadQuestions();


        addRadioQuestionsToLayout(questions);
        addCheckboxQuestionsToLayout(questions);

        submitButton = findViewById( R.id.submit_button );
        submitButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateAndShowScore();
            }
        } );


        question1 = findViewById( R.id.question1_radio_group );
        question1.setOnCheckedChangeListener( new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String selectedOptionText = "";
                ArrayList<String> selectedOptionArray = new ArrayList<>(  );

                switch (checkedId){
                    case R.id.question1_radio_option1:
                        selectedOptionText = ((RadioButton) findViewById(checkedId)).getText().toString();
                        selectedOptionArray.add( selectedOptionText );
                        questions.get( 0 ).setSelectedOption( selectedOptionArray );
                        Toast.makeText( MainActivity.this,  selectedOptionText + " is selected.", Toast.LENGTH_SHORT ).show();
                        break;
                    case R.id.question1_radio_option2:
                        selectedOptionText = ((RadioButton) findViewById(checkedId)).getText().toString();
                        selectedOptionArray.add( selectedOptionText );
                        questions.get( 0 ).setSelectedOption( selectedOptionArray );
                        Toast.makeText( MainActivity.this,  selectedOptionText + " is selected.", Toast.LENGTH_SHORT ).show();
                        break;
                    case R.id.question1_radio_option3:
                        selectedOptionText = ((RadioButton) findViewById(checkedId)).getText().toString();
                        selectedOptionArray.add( selectedOptionText );
                        questions.get( 0 ).setSelectedOption( selectedOptionArray );
                        Toast.makeText( MainActivity.this,  selectedOptionText + " is selected.", Toast.LENGTH_SHORT ).show();
                        break;
                    case R.id.question1_radio_option4:
                        selectedOptionText = ((RadioButton) findViewById(checkedId)).getText().toString();
                        selectedOptionArray.add( selectedOptionText );
                        questions.get( 0 ).setSelectedOption( selectedOptionArray );
                        Toast.makeText( MainActivity.this,  selectedOptionText + " is selected.", Toast.LENGTH_SHORT ).show();
                        break;
                }
            }
        } );

        question2 = findViewById( R.id.question2_radio_group );
        question2.setOnCheckedChangeListener( new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String selectedOptionText = "";
                ArrayList<String> selectedOptionArray = new ArrayList<>(  );

                switch (checkedId){
                    case R.id.question2_radio_option1:
                        selectedOptionText = ((RadioButton) findViewById(checkedId)).getText().toString();
                        selectedOptionArray.add( selectedOptionText );
                        questions.get( 1 ).setSelectedOption( selectedOptionArray );
                        Toast.makeText( MainActivity.this,  selectedOptionText + " is selected.", Toast.LENGTH_SHORT ).show();
                        break;
                    case R.id.question2_radio_option2:
                        selectedOptionText = ((RadioButton) findViewById(checkedId)).getText().toString();
                        selectedOptionArray.add( selectedOptionText );
                        questions.get( 1 ).setSelectedOption( selectedOptionArray );
                        Toast.makeText( MainActivity.this,  selectedOptionText + " is selected.", Toast.LENGTH_SHORT ).show();
                        break;
                    case R.id.question2_radio_option3:
                        selectedOptionText = ((RadioButton) findViewById(checkedId)).getText().toString();
                        selectedOptionArray.add( selectedOptionText );
                        questions.get( 1 ).setSelectedOption( selectedOptionArray );
                        Toast.makeText( MainActivity.this,  selectedOptionText + " is selected.", Toast.LENGTH_SHORT ).show();
                        break;
                    case R.id.question2_radio_option4:
                        selectedOptionText = ((RadioButton) findViewById(checkedId)).getText().toString();
                        selectedOptionArray.add( selectedOptionText );
                        questions.get( 1 ).setSelectedOption( selectedOptionArray );
                        Toast.makeText( MainActivity.this,  selectedOptionText + " is selected.", Toast.LENGTH_SHORT ).show();
                        break;
                }
            }
        } );

        question3 = findViewById( R.id.question3_radio_group );
        question3.setOnCheckedChangeListener( new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String selectedOptionText = "";
                ArrayList<String> selectedOptionArray = new ArrayList<>(  );

                switch (checkedId){
                    case R.id.question3_radio_option1:
                        selectedOptionText = ((RadioButton) findViewById(checkedId)).getText().toString();
                        selectedOptionArray.add( selectedOptionText );
                        questions.get( 2 ).setSelectedOption( selectedOptionArray );
                        Toast.makeText( MainActivity.this,  selectedOptionText + " is selected.", Toast.LENGTH_SHORT ).show();
                        break;
                    case R.id.question3_radio_option2:
                        selectedOptionText = ((RadioButton) findViewById(checkedId)).getText().toString();
                        selectedOptionArray.add( selectedOptionText );
                        questions.get( 2 ).setSelectedOption( selectedOptionArray );
                        Toast.makeText( MainActivity.this,  selectedOptionText + " is selected.", Toast.LENGTH_SHORT ).show();
                        break;
                    case R.id.question3_radio_option3:
                        selectedOptionText = ((RadioButton) findViewById(checkedId)).getText().toString();
                        selectedOptionArray.add( selectedOptionText );
                        questions.get( 2 ).setSelectedOption( selectedOptionArray );
                        Toast.makeText( MainActivity.this,  selectedOptionText + " is selected.", Toast.LENGTH_SHORT ).show();
                        break;
                    case R.id.question3_radio_option4:
                        selectedOptionText = ((RadioButton) findViewById(checkedId)).getText().toString();
                        selectedOptionArray.add( selectedOptionText );
                        questions.get( 2 ).setSelectedOption( selectedOptionArray );
                        Toast.makeText( MainActivity.this,  selectedOptionText + " is selected.", Toast.LENGTH_SHORT ).show();
                        break;
                }
            }
        } );


        selectedOptionArray = new ArrayList<>(  );
        View.OnClickListener checkboxOptionListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectedOptionText = "";

                int checkId = v.getId();
                switch (checkId){
                    case R.id.question4_checkbox_option1:
                        selectedOptionText = ((CheckBox) findViewById(checkId)).getText().toString();
                        if(((CheckBox) findViewById( checkId )).isChecked()){
                            selectedOptionArray.add( selectedOptionText );
                        } else {
                            selectedOptionArray.remove( selectedOptionText );
                        }
                        questions.get( 3 ).setSelectedOption( selectedOptionArray);
                        Toast.makeText( MainActivity.this,  selectedOptionText + " is selected.", Toast.LENGTH_SHORT ).show();
                        break;
                    case R.id.question4_checkbox_option2:
                        selectedOptionText = ((CheckBox) findViewById(checkId)).getText().toString();
                        if(((CheckBox) findViewById( checkId )).isChecked()){
                            selectedOptionArray.add( selectedOptionText );
                        } else {
                            selectedOptionArray.remove( selectedOptionText );
                        }
                        questions.get( 3 ).setSelectedOption( selectedOptionArray);
                        Toast.makeText( MainActivity.this,  selectedOptionText + " is selected.", Toast.LENGTH_SHORT ).show();
                        break;
                    case R.id.question4_checkbox_option3:
                        selectedOptionText = ((CheckBox) findViewById(checkId)).getText().toString();
                        if(((CheckBox) findViewById( checkId )).isChecked()){
                            selectedOptionArray.add( selectedOptionText );
                        } else {
                            selectedOptionArray.remove( selectedOptionText );
                        }
                        questions.get( 3 ).setSelectedOption( selectedOptionArray);
                        Toast.makeText( MainActivity.this,  selectedOptionText + " is selected.", Toast.LENGTH_SHORT ).show();
                        break;
                    case R.id.question4_checkbox_option4:
                        selectedOptionText = ((CheckBox) findViewById(checkId)).getText().toString();
                        if(((CheckBox) findViewById( checkId )).isChecked()){
                            selectedOptionArray.add( selectedOptionText );
                        } else {
                            selectedOptionArray.remove( selectedOptionText );
                        }
                        questions.get( 3 ).setSelectedOption( selectedOptionArray);
                        Toast.makeText( MainActivity.this,  selectedOptionText + " is selected.", Toast.LENGTH_SHORT ).show();
                        break;
                }
            }
        };

        // These are 4 listeners for the checkbox type question4
        question4CheckboxOption1 = findViewById( R.id.question4_checkbox_option1 );
        question4CheckboxOption1.setOnClickListener( checkboxOptionListener );
        question4CheckboxOption2 = findViewById( R.id.question4_checkbox_option2 );
        question4CheckboxOption2.setOnClickListener( checkboxOptionListener );
        question4CheckboxOption3 = findViewById( R.id.question4_checkbox_option3 );
        question4CheckboxOption3.setOnClickListener( checkboxOptionListener );
        question4CheckboxOption4 = findViewById( R.id.question4_checkbox_option4 );
        question4CheckboxOption4.setOnClickListener( checkboxOptionListener );


    }

    private void calculateAndShowScore() {

        int numberOfRightAnswers = 0;
        int numberOfWrongAnswers = 0;
        for(Question question : questions) {

            if(question.getSelectedOption().size() != question.getRightAnswer().size()){
                numberOfWrongAnswers +=1;
            } else {

                int rightCheckCounter = 0;
                for (String rightAnswer : question.getRightAnswer()) {
                    for(String selectedOption : question.getSelectedOption()) {
                        if(rightAnswer == selectedOption) {
                            rightCheckCounter +=1;
                        }
                    }
                }
                if(rightCheckCounter == question.getRightAnswer().size()){
                    numberOfRightAnswers +=1;
                } else {
                    numberOfWrongAnswers +=1;
                }

            }

        }

        Toast.makeText( this," Total right answers: " + numberOfRightAnswers, Toast.LENGTH_SHORT ).show();
        Toast.makeText( this," Total wrong answers: " + numberOfWrongAnswers, Toast.LENGTH_SHORT ).show();


    }

    private ArrayList<Question> loadQuestions(){

        Question question1 = new Question();
        question1.setContext( "Where are the most rainforests located ?" );
        question1.getOptions().add( "Northern Asia" );
        question1.getOptions().add( "Northern Europe" );
        question1.getOptions().add( "Latin America and Southern Europe" );
        question1.getOptions().add( "Brazil and Latin America" );
        ArrayList<String> rightAnswerArrayForQuestion1 = new ArrayList<>(  );
        rightAnswerArrayForQuestion1.add( "Brazil and Latin America" );
        question1.setRightAnswer( rightAnswerArrayForQuestion1 );
        questions.add( question1 );


        Question question2 = new Question();
        question2.setContext( " Which countries surround the Caspian Sea ? " );
        question2.getOptions().add( "Turkey, Blgaria, Turkmenistan, Syria, Russia" );
        question2.getOptions().add( "Russia, Azerbaijan, Turkmenistan, Iraq, Afganistan" );
        question2.getOptions().add( "Azerbaijan, Russia, Iran, Turkmenistan, Kazakistan" );
        question2.getOptions().add( "Azerbaijan, Russia, Iraq, Turkmenistan, Kazakistan" );
        ArrayList<String> rightAnswerArrayForQuestion2 = new ArrayList<>(  );
        rightAnswerArrayForQuestion2.add( "Azerbaijan, Russia, Iran, Turkmenistan, Kazakistan"  );
        question2.setRightAnswer( rightAnswerArrayForQuestion2 );
        questions.add( question2 );


        Question question3 = new Question();
        question3.setContext( "Select the island below: " );
        question3.getOptions().add( "Cambodia" );
        question3.getOptions().add( "Caspian" );
        question3.getOptions().add( "The Dalmatian" );
        question3.getOptions().add( "Baltic" );
        ArrayList<String> rightAnswerArrayForQuestion3 = new ArrayList<>(  );
        rightAnswerArrayForQuestion3.add( "The Dalmatian" );
        question3.setRightAnswer( rightAnswerArrayForQuestion3 );
        questions.add( question3 );

        Question question4 = new Question();
        question4.setContext( "Which of the following countries' official language is English?" );
        question4.getOptions().add( "Australia" );
        question4.getOptions().add( "Brasilia" );
        question4.getOptions().add( "Romania" );
        question4.getOptions().add( "USA" );
        ArrayList<String> rightAnswerArrayForQuestion4 = new ArrayList<>(  );
        rightAnswerArrayForQuestion4.add( "USA" );
        rightAnswerArrayForQuestion4.add( "Australia" );
        question4.setRightAnswer( rightAnswerArrayForQuestion4 );
        questions.add( question4 );

        return questions;
    }

    private void addRadioQuestionsToLayout(ArrayList<Question> questions) {

        // adding question 1 context and options to the layout
        TextView question1Context = findViewById( R.id.question1_context);
        question1Context.setText( questions.get( 0 ).getContext() );
        RadioButton question1Option1 = findViewById( R.id.question1_radio_option1 );
        question1Option1.setText( questions.get( 0 ).getOptions().get( 0 ));
        RadioButton question1Option2 = findViewById( R.id.question1_radio_option2 );
        question1Option2.setText( questions.get( 0 ).getOptions().get( 1 ) );
        RadioButton question1Option3 = findViewById( R.id.question1_radio_option3 );
        question1Option3.setText( questions.get( 0 ).getOptions().get( 2 ));
        RadioButton question1Option4 = findViewById( R.id.question1_radio_option4 );
        question1Option4.setText( questions.get( 0 ).getOptions().get( 3 ) );

        // adding question 2 context and options to the layout
        TextView question2Context = findViewById( R.id.question2_context);
        question2Context.setText( questions.get( 1 ).getContext() );
        RadioButton question2Option1 = findViewById( R.id.question2_radio_option1 );
        question2Option1.setText( questions.get( 1 ).getOptions().get( 0 ));
        RadioButton question2Option2 = findViewById( R.id.question2_radio_option2 );
        question2Option2.setText( questions.get( 1 ).getOptions().get( 1 ) );
        RadioButton question2Option3 = findViewById( R.id.question2_radio_option3 );
        question2Option3.setText( questions.get( 1 ).getOptions().get( 2 ));
        RadioButton question2Option4 = findViewById( R.id.question2_radio_option4 );
        question2Option4.setText( questions.get( 1 ).getOptions().get( 3 ) );

        // adding question 3 context and options to the layout
        TextView question3Context = findViewById( R.id.question3_context);
        question3Context.setText( questions.get( 2 ).getContext() );
        RadioButton question3Option1 = findViewById( R.id.question3_radio_option1 );
        question3Option1.setText( questions.get( 2 ).getOptions().get( 0 ));
        RadioButton question3Option2 = findViewById( R.id.question3_radio_option2 );
        question3Option2.setText( questions.get( 2 ).getOptions().get( 1 ) );
        RadioButton question3Option3 = findViewById( R.id.question3_radio_option3 );
        question3Option3.setText( questions.get( 2 ).getOptions().get( 2 ));
        RadioButton question3Option4 = findViewById( R.id.question3_radio_option4 );
        question3Option4.setText( questions.get( 2 ).getOptions().get( 3 ) );

    }

    private void addCheckboxQuestionsToLayout(ArrayList<Question> questions) {

        // adding question 4 context and options to the layout
        TextView question4Context = findViewById( R.id.question4_context);
        question4Context.setText( questions.get( 3 ).getContext() );
        CheckBox question4Option1 = findViewById( R.id.question4_checkbox_option1 );
        question4Option1.setText( questions.get( 3 ).getOptions().get( 0 ));
        CheckBox question4Option2 = findViewById( R.id.question4_checkbox_option2 );
        question4Option2.setText( questions.get( 3 ).getOptions().get( 1 ) );
        CheckBox question4Option3 = findViewById( R.id.question4_checkbox_option3 );
        question4Option3.setText( questions.get( 3 ).getOptions().get( 2 ));
        CheckBox question4Option4 = findViewById( R.id.question4_checkbox_option4 );
        question4Option4.setText( questions.get( 3 ).getOptions().get( 3 ) );

    }


}
