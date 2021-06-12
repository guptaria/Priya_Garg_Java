package com.company.M2ChallengeGargPriya.controllers;

import com.company.M2ChallengeGargPriya.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {
    private static List<Quote> quoteList = new ArrayList<>(Arrays.asList(

            new Quote(1, "Jack Kerouac", "One day I will find the right words, and they will be simple."),
            new Quote(2, "Sylvia Plath", "Let me live, love, and say it well in good sentences."),
            new Quote(3, "Priya", "You can totally do this"),
            new Quote(4, "Thomas Carlyle", "No pressure, no diamonds"),
            new Quote(5, "Helen Keller", "We can do anything we want to if we stick to it long enough"),
            new Quote(6, "Terry Pratchett", "The first draft is just you telling yourself the story."),
            new Quote(7, "Steven Pressfield",  "Start before you’re ready."),
            new Quote(8, "Malcolm X",  "If you have no critics, you’ll likely have no success."),
            new Quote(9, "C.S. Lewis", "You can make anything by writing."),
            new Quote(10, "J. K. Rowling", "Words are our most inexhaustible source of magic.")

    ));

    //Getting all the quotes with author names
    @GetMapping("/quote")
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getQuoteList() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(quoteList.size());
        Quote randomQuote=quoteList.get(randomIndex);

        return randomQuote;

    }
}