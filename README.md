Parrot Refactoring Kata
=======================

Can you spot any code smells in this code? I'll give you a clue - a spot of Pol(l)ymorphism should improve matters!

Refactor this code, take small steps, run the tests often. See how small and beautiful you can make it.

Acknowledgements
----------------

This code is heavily inspired by one of the examples in Martin Fowler's book "Refactoring". It's a classic, and if it's not on your bookshelf already I suggest you treat yourself to a copy!

Refactoring Implementation
--------------------------
Parrot class becomes abstract with some abstract methods.

Each Parrot enum type becomes a class extending the Parrot class.
Each Parrot type specific behavior is implemented by the specific Parrot type class.
