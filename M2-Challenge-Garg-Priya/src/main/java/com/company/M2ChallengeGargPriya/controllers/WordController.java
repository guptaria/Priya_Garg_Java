package com.company.M2ChallengeGargPriya.controllers;

import com.company.M2ChallengeGargPriya.models.Definition;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class WordController {
    Random rand = new Random();
    private static List<Definition> wordList = new ArrayList<>(Arrays.asList(
            new Definition(1, "minute", "infinitely or immeasurably small"),
            new Definition(2, "consider", "deem to be"),
            new Definition(3, "approach", "move towards"),
            new Definition(4, "establish", "set up"),
            new Definition(5, "fancy", "imagine"),
            new Definition(6, "appoint", "assign a duty"),
            new Definition(7, "project", "a planned undertaking"),
            new Definition(8, "constant", "a quantity that does not vary"),
            new Definition(9, "appeal", "be attractive to"),
            new Definition(10, "generate", "bring into existence")
    ));


    //Getting all the words with definition
    @GetMapping("/word")
    @ResponseStatus(value = HttpStatus.OK)
    public Definition getWordList() {
        int randomIndex = rand.nextInt(wordList.size());

        Definition wordDefinition = wordList.get(randomIndex);
        return wordDefinition;

    }
}

