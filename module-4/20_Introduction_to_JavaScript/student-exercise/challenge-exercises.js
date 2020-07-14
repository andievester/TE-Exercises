﻿/*
1. **iqTest** Bob is preparing to pass an IQ test. The most frequent task in this test 
    is to find out which one of the given numbers differs from the others. Bob observed
    that one number usually differs from the others in evenness. Help Bob — to check his 
    answers, he needs a program that among the given numbers finds one that is different in 
    evenness, and return the position of this number. _Keep in mind that your task is to help 
    Bob solve a real IQ test, which means indexes of the elements start from 1 (not 0)_

		iqTest("2 4 7 8 10") → 3 //third number is odd, while the rest are even
		iqTest("1 2 1 1") → 2 // second number is even, while the rest are odd
		iqTest("") → 0 // there are no numbers in the given set
        iqTest("2 2 4 6") → 0 // all numbers are even, therefore there is no position of an odd number
*/
        function iqTest(test) {
            array = test.split(' ');
            array.unshift(0);
            let evenCount = -1;
            let oddCount = 0;
            let evenWinner = 0;
            let oddWinner = 0;

            for (i of array) {
                if (i % 2 === 0) {
                    evenCount++
                    evenWinner = i;
                } else if (i % 2 != 0) {
                    oddCount++
                    oddWinner = i;
                }
            }
            if (oddCount === 0 || evenCount === 0) {
                return 0;
            } if (oddCount > evenCount) {
                return array.indexOf(evenWinner);
            } if (oddCount < evenCount) {
                return array.indexOf(oddWinner);
            }

        }
              /*   I thought about going about this problem with alternative logic-
                    could you provide feedback on if and how I could get this code
                    to function? Thanks!! 

                const array = test.split(" ");
                let array2 = [];
                let array3 = [];
                for (let i = 0; i < array.length; i++) {
                    if (array[i] % 2 === 0) {
                        array2.push(array[i]);
                    } if (array[i] % 2 != 0) {
                        array3.push(array[i]);
                    }
                } if (array2 > array3) {
                    let x = array3.slice(0);
                    return (array.indexOf(x) + 1);
                } else if (array3 > array2) {
                    let y = array2.slice(0);
                    return (array.indexOf(y) + 1);
                } else if (array3 === null) {
                    return 0;
                }  */
        

/*
2. **titleCase** Write a function that will convert a string into title case, given an optional 
    list of exceptions (minor words). The list of minor words will be given as a string with each 
    word separated by a space. Your function should ignore the case of the minor words string -- 
    it should behave in the same way even if the case of the minor word string is changed.


* First argument (required): the original string to be converted.
* Second argument (optional): space-delimited list of minor words that must always be lowercase
except for the first word in the string. The JavaScript tests will pass undefined when this 
argument is unused.

		titleCase('a clash of KINGS', 'a an the of') // should return: 'A Clash of Kings'
		titleCase('THE WIND IN THE WILLOWS', 'The In') // should return: 'The Wind in the Willows'
        titleCase('the quick brown fox') // should return: 'The Quick Brown Fox'
*/
        function titleCase(title, exceptions) {
            title = title.toLowerCase().split(' ');
            if(exceptions != undefined)
            exceptions = exceptions.toLowerCase().split(' ')
            finalTitle = [];
            
            for(word of title) {
                if(exceptions != undefined && exceptions.includes(word) && finalTitle.length > 0){
                    finalTitle.push(word);
                }
                else { 
                    let firstLetter = word[0].toUpperCase();
                    wordNoFirstLetter = word.slice(1)
                    finalTitle.push(firstLetter + wordNoFirstLetter)
                }
            }
            return finalTitle.join(' ')
        }