-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

INSERT INTO actor (first_name, last_name) 
VALUES ('HAMPTON','AVENUE'), ('LISA', 'BYWAY');

SELECT * FROM actor
-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.

INSERT INTO film (title, description, release_year, language_id, length)
VALUES ('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in 
ancient Greece', '2008', '1', '18');

SELECT * FROM film WHERE film.title = 'Euclidean PI'
SELECT * FROM actor WHERE first_name = 'HAMPTON'
-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

--SELECT * FROM film WHERE film.title = 'Euclidean PI';
--ID FOR EUCLIDEAN PI = 1001
--SELECT * FROM actor WHERE first_name = 'HAMPTON';
--ID FOR HAMPTON = 201
--ID FOR LISA = 202

INSERT INTO film_actor(actor_id, film_id)
VALUES (201, 1001);
INSERT INTO film_actor(actor_id, film_id)
VALUES (202, 1001);

-- 4. Add Mathmagical to the category table.

INSERT INTO category(name)
VALUES('Mathmagical');



-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
-- Mathmagical id = 17
-- EGG IGBY id = 274
-- KARATE MOON id = 494
-- RANDOM GO id = 714
-- YOUNG LANGUAGE id = 996

INSERT INTO film_category(film_id, category_id)
VALUES (1001, 17);

UPDATE film_category
SET category_id = 17
WHERE film_id = 274;

UPDATE film_category
SET category_id = 17
WHERE film_id = 494;

UPDATE film_category
SET category_id = 17
WHERE film_id = 714;

UPDATE film_category
SET category_id = 17
WHERE film_id = 996;


-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)

UPDATE film 
SET rating = 'G'
WHERE film_id IN
(SELECT film_id FROM film_category WHERE category_id =
(SELECT category_id FROM category WHERE name = 'Mathmagical'));

-- 7. Add a copy of "Euclidean PI" to all the stores.
--Euclidean PI film id = 1001

INSERT INTO inventory(store_id, film_id)
VALUES(1, 1001);
INSERT INTO inventory(store_id, film_id)
VALUES(2, 1001);

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE> DELETE did not work because they key exists on another table

DELETE 
FROM film
WHERE film.title = 'Euclidean PI';


-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE> DELETE did not work because the command violates the foreign key constraint

DELETE 
FROM category
WHERE category_id = 17;

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE> YES, because it's a primary key

DELETE
FROM film_category
WHERE category_id = 17;

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <YOUR ANSWER HERE> first attempt worked because the primary key was deleted first, 
-- second attempt did not work because it still violates the foreign key constraint

DELETE 
FROM category
WHERE category_id = 17;

DELETE 
FROM film
WHERE film.title = 'Euclidean PI';


-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.

SELECT * FROM film WHERE film_id = 1001

-- This movie has data in film_category, film_actor, and inventory. Adjustments 
-- must be made in these categories to successfully delete this film. 