# random-generator
Addition of few Random Values
Aplikacja jest dostępna lokalnie pod portem 8097
Można wykonać strzał (np. za pomocą Postmana)  GET localhost:8097/random-api?from=12&to=300&actionType=ADDITION&dataType=INTEGER


Parametry from, to, actionType, dataType są obowiązkowe.

---"from" oraz "to" - parametry, które wskazują nam w jakie minimalne/maksymalne znaczenie może mieć wygenerowana liczba. Tak np. moglibyśmy użyć te parametry 
dla generowania obiektów typu String, czyli używając ich dla sterowania długością.

Generowanie obiektów(dla danego requesta) typu INTEGER będzie między 12 a 300.

--- "actionType" może być rozszerzony o DELETION, MULTIPLYING oraz DIVIDING.
Opisuje jaki typ operacji chcemy dokonać nad wygenerowanymi obiektami. Dla String byłyby inne np. CONCATINATING.

---"dataType" parametr wskazuje na to, który typ generowanych obiektów chcemy otrzymać. Można dodać obsługę dla dataType=STRING
