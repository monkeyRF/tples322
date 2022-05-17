class Card(
    val rank: Rank,
    val suit: Suit
) : Comparable<Card> {

    override fun compareTo(other: Card) = if (suit < other.suit) -1
    else if (suit > other.suit) 1
    else if (rank < other.rank) -1
    else if (rank > other.rank) 1
    else 0

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Card) return false
        return other.rank == rank && other.suit == suit
    }

    override fun hashCode() = rank.hashCode() * 31 + suit.hashCode()

    override fun toString() = "$rank $suit"
}