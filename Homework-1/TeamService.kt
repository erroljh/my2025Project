package jetbrains.kotlin.course.alias.team

import jetbrains.kotlin.course.alias.util.Identifier
import jetbrains.kotlin.course.alias.util.IdentifierFactory
import org.springframework.stereotype.Service

@Service
class TeamService {
    val identifierFactory = IdentifierFactory()

    companion object {
        val teamsStorage = mutableMapOf<Identifier, Team>()
    }

    fun generateTeamsForOneRound(teamsNumber: Int): List<Team> {
        val teams = (1..teamsNumber).map {
            val id = identifierFactory.uniqueIdentifier()
            val team = Team(id)
            teamsStorage[id] = team
            team
        }
        return teams
    }
}
