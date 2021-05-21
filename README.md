# swing_project
Training Swing project for SDA 

Gra polega na odgadnięciu w najmniejszej liczbie kroków wylosowanej liczby od 1 do 200.

Funkcjonalność:
Aby zagrać należy się zalogować, jeżeli użytkownik nie istnieje w bazie danych trzeba się zarejestrować. 
Po odgadnięciu liczby można wpisać wynik do tabeli.
Po naciśnięciu przycisku „Pokaż tabelę wyników” można podejrzeć listę graczy z ich wynikami i sprawdzić, gdzie znajdujemy się na liście. Wygrywa osoba, która odgadnie liczbę w najmniejszej ilości prób.

Technologia:
 - Java Swing
 - PostreSQL
 - JDBC

Opis:

1.	Panel Logowania

a.	Jeżeli użytkownik nie istnieję to pokazuje się okno informujące o tym i proponujące rejestrację

![01_Logowanie](https://user-images.githubusercontent.com/68491092/109712923-e7456280-7ba0-11eb-920a-43c7ee31f3e5.PNG)

b.	Po potwierdzeniu możemy zarejestrować użytkownika poprzez kliknięcie "Rejestracja". Możemy teraz zalogować się do gry. 

2.	Po zalogowaniu pojawia się okno z grą.

a.	Po lewej stronie u góry jest informacja kto jest zalogowany (tutaj Lukasz)

b.	W pole tekstowe wpisujemy liczbę z zakresu od 1 do 200

![02_gra](https://user-images.githubusercontent.com/68491092/109713224-3b504700-7ba1-11eb-86ca-92fa55082061.PNG)

3.	Gdy wpiszemy liczbę naciskamy przycisk „Sprawdź” aby sprawdzić czy poszukiwana liczba jest większa czy mniejsza.

![03_gra](https://user-images.githubusercontent.com/68491092/109713413-76527a80-7ba1-11eb-8bac-5671fbbc0d2b.PNG)

![04_gra](https://user-images.githubusercontent.com/68491092/109713448-836f6980-7ba1-11eb-878b-ad6a8bad2a0a.PNG)

Gdy zostanie wpisana inna wartość niż liczbowa:

![044_error](https://user-images.githubusercontent.com/68491092/109720633-a2bec480-7baa-11eb-8450-e4316f8e8975.PNG)

4.	Gdy zgadniesz liczbę:

a.	tło zmienia się na kolor zielony

b.	wyświetla się wynik - po ilu strzałach nastąpiło trafienie

c.	wyskakuje okno z pytaniem czy zapisać wynik (jeżeli tak to nastąpi przypisanie wyniku gracza w bazie danych)

![05_gra](https://user-images.githubusercontent.com/68491092/109713607-bc0f4300-7ba1-11eb-9682-83c3b5bb8f4a.PNG)

5.	Po kliknięciu „Pokaż tabelę wyników” widzimy nasz wynik oraz wyniki innych graczy.

![Wynik](https://user-images.githubusercontent.com/68491092/109713693-d2b59a00-7ba1-11eb-9dce-7a7a09187b27.PNG)
