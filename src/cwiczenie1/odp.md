Za pomocą interfejsu definiujemy zbiór pól oraz metod. Implementując interfejs  musimy spełnić wymagania jakie przed nami stawia interfejs tzn.
zaimplementować jego metody oraz zmienne.

Wzorzec projektowy strategia ułatwia tworzenie różnie zachowujących się obiektów na podstawie tej samej klasy, bądź dynamiczną 
zmianę ich zachowania w trakcie trwania programu. Osiągnąc to możemy poprzez zdefiniowanie w klasie na podstawie której tworzymy obiekt 
 zmiennych o odpowiednich typach np. intefejsowych, następnie w momencie tworzenia obiektu podajemy jako argumenty konkretne implemenctacje danych interfejsów, które mogą się różnie zachowywać w zależności od potrzeb działania naszego obiektu.