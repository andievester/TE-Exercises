package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int numberOfRaccoons = 3;
		int numberOfDinnerRaccoons = 2;
		int remainingRaccoons = numberOfRaccoons - numberOfDinnerRaccoons;
		System.out.println(remainingRaccoons);
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int flowers = 5;
		int bees = 3;
		int lessBeesThanFlowers = flowers - bees;
		System.out.println(lessBeesThanFlowers);
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int eatingPigeon = 1;
		int eatingPigeonFriend = 1;
		int pigeonsEating = eatingPigeon + eatingPigeonFriend;
		System.out.println(pigeonsEating);
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int fenceOwls = 3;
		int fenceOwlsFriends = 2;
		int owlsOnFence = fenceOwls + fenceOwlsFriends;
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int workingBeavers = 2;
		int swimmingBeavers = 1;
		int totalWorkingBeavers = workingBeavers - swimmingBeavers;
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int sittingToucans = 2;
		int sittingToucansFriend = 1;
		int totalToucans = sittingToucans + sittingToucansFriend;
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrels = 4;
		int nuts = 2;
		int moreSquirrelsThanNuts = squirrels - nuts;
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		int quarterCents = 25;
		int dimeCents = 10;
		int nickelCents = (2 * 5);
		String cents = " cents";
		String totalCents = quarterCents + dimeCents + nickelCents + cents;
		System.out.println(totalCents);
				
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int brierMuffins = 18;
		int macadamsMuffins = 20;
		int flanneryMuffins = 17;
		int totalMuffins = brierMuffins + macadamsMuffins + flanneryMuffins;

        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		int yoyoCents = 24;
		int whistleCents = 14;
		String totalToyCents = yoyoCents + whistleCents + cents;
		System.out.println(totalToyCents);
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalMarshmallows = largeMarshmallows + miniMarshmallows;
		
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int hiltSnow = 29;
		int brecknockSnow = 17;
		String inches = " inches";
		String hiltSnowAdvantage = hiltSnow + brecknockSnow + inches;
	
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int truckDollars = 3;
		int pencilDollars = 2;
		String dollars = " dollars";
		String totalToyDollars = truckDollars + pencilDollars + dollars;
		System.out.println(totalToyDollars);
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int joshOriginalMarbles = 16;
		int joshLostMarbles = 7;
		int joshLeftoverMarbles = joshOriginalMarbles - joshLostMarbles;
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int meganSeashells = 19;
		int desiredSeashells = 25;
		int neededSeashells = desiredSeashells - meganSeashells;
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int totalBalloons = 17;
		int redBalloons = 8;
		int greenBalloons = totalBalloons - redBalloons;
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int booksOnShelf = 38;
		int martasBooks = 10;
		int totalBooksOnShelf = booksOnShelf + martasBooks;
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int beeLegs = 6;
		int numberofBees = 8;
		int totalBeeLegs = beeLegs * numberofBees;

        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double iceCreamConeCost = 0.99;
		int numberOfCones = 2;
		String dollarSign = "$";
		String totalConeCost = dollarSign + iceCreamConeCost * numberOfCones;
		System.out.println(totalConeCost);
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int necessaryRocks = 125;
		int availableRocks = 64;
		int rocksToAcquire = necessaryRocks - availableRocks;
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int hiltOriginalMarbles = 38;
		int hiltLostMarbles = 15;
		int hiltLeftoverMarbles = hiltOriginalMarbles - hiltLostMarbles;
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int milesToConcert = 78;
		int milesToGas = 32;
		int milesLeftToConcert = milesToConcert - milesToGas;
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		int morningMinShovelingSnow = 90;
		int afternoonMinShovelingSnow = 45;
		int totalMinShovelingSnow = morningMinShovelingSnow + afternoonMinShovelingSnow;
		System.out.println(totalMinShovelingSnow);
		int minutesPerHour = 60;
		int hoursShovelingSnow = (totalMinShovelingSnow / minutesPerHour);
;		System.out.println(hoursShovelingSnow);
		int remainingMinShovelingSnow = totalMinShovelingSnow % minutesPerHour;
		System.out.println(remainingMinShovelingSnow);
		String hours = " hours ";
		String and = "and ";
		String minutes = " minutes";
		String shovelingTimeInHoursAndMinutes = hoursShovelingSnow + hours + and + remainingMinShovelingSnow + minutes;
		System.out.println(shovelingTimeInHoursAndMinutes);
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		int costOfDogInCents = 50;
		int totalDogs = 6;
		int totalCostOfDogsInCents = costOfDogInCents * totalDogs;
		System.out.println(totalCostOfDogsInCents);
		int centsPerDollar = 100;
		int costOfDogsInDollars = totalCostOfDogsInCents / centsPerDollar;
		System.out.println(costOfDogsInDollars);
		String totalCostOfDogs = costOfDogsInDollars + dollars;
		System.out.println(totalCostOfDogs);
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int hiltPencilCents = 50;
		int costOfPencilInCents = 7;
		int hiltsPencils = hiltPencilCents / costOfPencilInCents;
		System.out.println(hiltsPencils);
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int hiltsButterflies = 33;
		int orangeButterflies = 20;
		int redButterflies = hiltsButterflies - orangeButterflies;
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		int katesCash = 100;
		int candyCost = 54;
		String katesChange = katesCash - candyCost + cents;
		System.out.println(katesChange);
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int marksTrees = 13;
		int markPlantsTrees = 12;
		int markTotalTrees = marksTrees + markPlantsTrees;
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int hoursPerDay = 24;
		int numberOfDays = 2;
		int timeToJoysGrandma = hoursPerDay * numberOfDays;
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int kimsCousins = 4;
		int piecesOfGum = 5;
		int gumForCousins = kimsCousins * piecesOfGum;
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		int dansDollars = 3;
		int costOfCandyBar = 1;
		String dansLeftoverMoney = dansDollars - costOfCandyBar + dollars;
		System.out.println(dansLeftoverMoney);
		
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatsInLake = 5;
		int peopleInBoat = 3;
		int peopleOnLake = boatsInLake * peopleInBoat;
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int ellensLegos = 380;
		int ellensLostLegos = 57;
		int remainingLegos = ellensLegos - ellensLostLegos;
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int arthursMuffins = 35;
		int desiredMuffins = 83;
		int requiredAdditionalMuffins = desiredMuffins - arthursMuffins;
		
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willysCrayons = 1400;
		int lucysCrayons = 290;
		int willyCrayonAdvantage = willysCrayons - lucysCrayons;
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersPerPage = 10;
		int numberOfPages = 22;
		int totalStickers = stickersPerPage * numberOfPages;
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int numberOfCupcakes = 96;
		int numberOfChildren = 8;
		int cupcakesPerChild = numberOfCupcakes / numberOfChildren;
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		int totalGingerbreadCookies = 47;
		int cookiesPerJar = 6;
		int remainingCookies =  totalGingerbreadCookies % cookiesPerJar;
		System.out.println(remainingCookies);
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		int numberOfCroissants = 59;
		int numberOfNeighbors = 8;
		int remainingCroissants = numberOfCroissants % numberOfNeighbors;
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		double cookiesOnTray = 12;
		double totalCookies = 276;
		double traysNeeded = totalCookies / cookiesOnTray;
		System.out.println(traysNeeded);
		
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		double numberOfPretzels = 480;
		double pretzelServingSize = 12;
		double pretzelServings = numberOfPretzels / pretzelServingSize;
		System.out.println(pretzelServings);
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int numberOfLemonCupcakes = 53;
		int lemonCupcakesLeftBehind = 3;
		int lemonCupcakesPerBox = 3;
		int numberOfBoxes = (numberOfLemonCupcakes - lemonCupcakesLeftBehind) / lemonCupcakesPerBox;
		System.out.println(numberOfBoxes);
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrotSticks = 74;
		int peopleEatingCarrots = 12;
		int remainingCarrots = 74 % 12;
		System.out.println(remainingCarrots);
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int susiesBears = 98;
		int susiesShelfCapacity = 7;
		int filledShelves = 98 / 7;
		System.out.println(filledShelves);
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int susiesPictures = 480;
		int albumCapacity = 20;
		int necessaryAlbums = susiesPictures / albumCapacity;
		
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int joesCards = 94;
		int joesBoxes = 8;
		int filledBoxes = joesCards / joesBoxes;
		System.out.println(filledBoxes);
		int remainingCards = joesCards % joesBoxes;
		System.out.println(remainingCards);
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int susiesFathersBooks = 210;
		int susiesFathersShelves = 10;
		int booksPerShelf = susiesFathersBooks / susiesFathersShelves;
		System.out.println(booksPerShelf);
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		int cristinasCroissants = 17;
		int cristinasGuests = 7;
		int croissantsPerGuest = cristinasCroissants / cristinasGuests;
		System.out.println(croissantsPerGuest);
        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
		double billPaintRate = 1.0 / 2.15;
		double jillPaintRate = 1.0 / 1.90;
		double combinedPaintRate = billPaintRate + jillPaintRate;
		System.out.println(combinedPaintRate);
		double numberOfRooms = 5.0;
		double totalPaintingTimeRequired = numberOfRooms / combinedPaintRate;
		System.out.println(totalPaintingTimeRequired);
		
		double challengeNumberOfRooms = 623;
		double challengeCombinedPaintRate = challengeNumberOfRooms / combinedPaintRate;
		System.out.println(challengeCombinedPaintRate);
		double dailyHours = 8.0;
		double challengeTimeRequired = challengeCombinedPaintRate / dailyHours;
		System.out.println(challengeTimeRequired);
		
        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full
         name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */
		String lastName = "Vester, ";
		String firstName = "Andrea ";
		char middleInitial = 'C';
		String fullName = lastName + firstName + middleInitial + ".";
		System.out.println(fullName);
        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */
		double distanceBetweenChicagoAndNewYork = 800;
		double alreadyTravelled = 537;
		double percentTravelled = alreadyTravelled / distanceBetweenChicagoAndNewYork;
		System.out.println(percentTravelled);
		double conversion = 100.00;
		int intPercentTravelled = (int)(percentTravelled * conversion);
		System.out.println(intPercentTravelled);

	}

}
