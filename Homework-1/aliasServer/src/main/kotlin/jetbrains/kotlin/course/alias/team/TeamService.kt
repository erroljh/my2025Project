package jetbrains.kotlin.course.alias.team

import org.springframework.stereotype.Service
import java.util.ArrayList

@Service
class TeamService {

    fun generateTeamsForOneRound(teamsNumber: Int): List<Team> {
        if (teamsNumber <= 0) {
            return emptyList()
        }
        val teams = ArrayList<Team>()
        for (i in 1..teamsNumber) {
            teams.add(Team("Team $i"))
        }
        return teams.toList()
    }
}
