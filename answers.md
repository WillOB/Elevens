Activity 7 Questions:
1. You would need a deck of cards. Private instance variables: deck, size

2.  1. deal cards
    2. check for matches
    3. pick cards
    4. remove match
    5. replace cards
    6. repeat from step 2
    7. when there are no matches, terminate the game
        a. if there are cards left, you lose
        b. if there are no cards left, you win
        
3. Yep, its all there

4.  a. dealMyCards is called in the newGame method
    b. isLegal and anotherPlayisPossible should call containsPairSum11 and containsJQK
    c. Returned list is: [0, 1, 3, 6, 7]
    d.  for(i = 0; i < cIndexes.length; i++){
            System.out.println(cards[cIndexes[i]].toString());
        }
    e. anotherPlayisPossible needs to call cardIndexes so it knows which cards to look at, and if there are enough cards left