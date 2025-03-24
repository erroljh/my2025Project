package jetbrains.kotlin.course.alias.card

import jetbrains.kotlin.course.alias.util.Words
import org.springframework.stereotype.Service
import java.util.NoSuchElementException

@Service
class CardService {
    private var allCards: List<Card> = emptyList()

    private fun generateCards(): List<Card> {
        val words = Words.words.toWords()
        val cards = words.map { Card(it) }
        allCards = cards
        return cards
    }

    private fun List<String>.toWords(): List<Word> = this.map { Word(it) }

    fun getCardByIndex(index: Int): Card {
        if (allCards.isEmpty()) {
            generateCards()
        }
        if (index < 0 || index >= allCards.size) {
            throw NoSuchElementException("Card index is out of bounds: $index")
        }
        return allCards[index]
    }

    fun getCards(count: Int): List<Card> {
        if (allCards.isEmpty()) {
            generateCards()
        }
        if (count > allCards.size) {
            return allCards
        }
        return allCards.subList(0, count)
    }
}
