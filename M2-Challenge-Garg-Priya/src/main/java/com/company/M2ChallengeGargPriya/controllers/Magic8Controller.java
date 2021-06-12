package com.company.M2ChallengeGargPriya.controllers;

import com.company.M2ChallengeGargPriya.models.Answer;
import com.company.M2ChallengeGargPriya.models.Definition;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class Magic8Controller {
    int counter=0;
    Random rand = new Random();

    private static List<String> answerList = new ArrayList<>(Arrays.asList(
            "Yes,Definitely",
            "Most likely",
            "Certainly",
            "No,Definitely",
            "Ask me later",
            "Better not tell you",
            "Very doubtful",
            "Don't count on it",
            "Outlook good"
    ));


    @PostMapping("/magic")
    @ResponseStatus(value= HttpStatus.CREATED)
    public Answer createMagicQuestion(@RequestBody Answer question){
        int randomIndex = rand.nextInt(answerList.size());
        String randomAnswer = answerList.get(randomIndex);
        question.setId(++counter);
        question.setAnswer(randomAnswer);
         return question;
    }
}

