 fun main() {

/////////без репозитория

     val herbivores = mutableListOf(
     Herbivore (1,"horse","200 kg","hooves"),
     Herbivore(2,"rabbit","7 kg","fur")
     )

     val predators = mutableListOf(
     Predator(1,"tiger","200 kg","feline"),
     Predator(2,"crocodile","100 kg","reptile")
     )

     val animals = mutableListOf(
      Herbivore (1,"horse","200 kg","hooves"),
      Herbivore(2,"rabbit","7 kg","fur"),
      Predator(1,"tiger","200 kg","feline"),
      Predator(2,"crocodile","100 kg","reptile")
     )


  println(herbivores)
  println(predators)
  println(animals)
}