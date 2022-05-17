fun main() {
    val card1 = Card(Rank.Five, Suit.Clubs)
    val card2 = Card(Rank.Eight, Suit.Clubs)
    val card3 = Card(Rank.Ace, Suit.Diamonds)
    val card4 = Card(Rank.Two, Suit.Hearts)

    println("$card1 равна $card2? - ${if (card1 == card2) "Да" else "Нет"}")
    println("$card1 сильнее $card2? - ${if (card1 > card2) "Да" else "Нет"}")
    println("$card1 слабее $card2? - ${if (card1 < card2) "Да" else "Нет"}")
    println()
    println("$card1 равна $card3? - ${if (card1 == card3) "Да" else "Нет"}")
    println("$card1 сильнее $card3? - ${if (card1 > card3) "Да" else "Нет"}")
    println("$card1 слабее $card3? - ${if (card1 < card3) "Да" else "Нет"}")
    println()
    println("$card3 равна $card4? - ${if (card3 == card4) "Да" else "Нет"}")
    println("$card3 сильнее $card4? - ${if (card3 > card4) "Да" else "Нет"}")
    println("$card3 слабее $card4? - ${if (card3 < card4) "Да" else "Нет"}")
    println()
}