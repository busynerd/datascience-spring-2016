package edu.csula.datascience.jsouptest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NBAPageCollector {

	public static void main(String[] args) {

		List<BasketballObject> regularSeasonStats = new ArrayList<BasketballObject>();

		String url = "http://www.cbssports.com/nba/stats/teamsort/NBA/year-2015-season-regularseason-category-scoringpergame-type-team";

		Document doc = null;

		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		Elements rows = doc.getElementsByTag("tr");

		rows.remove(0);
		rows.remove(rows.size() - 1);

		String team = "";
		String games_played = "";
		String points_per_game = "";
		String field_goal_made = "";
		String field_goal_attempted = "";
		String field_goal_percentage = "";
		String three_points_made = "";
		String three_points_attempted = "";
		String three_points_percentage = "";
		String free_throws_made = "";
		String free_throws_attempted = "";
		String free_throws_percentage = "";

		for (Element row : rows) {
			Elements tds = row.getElementsByTag("td");

			for (int i = 0; i < tds.size(); i++) {

				switch (i) {
				case 0:
					team = row.getElementsByTag("td").get(i).text();
					System.out.println("team: " + team);
					break;
				case 1:
					games_played = row.getElementsByTag("td").get(i).text();
					System.out.println("games_played: " + games_played);
					break;
				case 2:
					points_per_game = row.getElementsByTag("td").get(i).text();
					System.out.println("points_per_game: " + points_per_game);
					break;
				case 3:
					field_goal_made = row.getElementsByTag("td").get(i).text();
					System.out.println("field_goal_made: " + field_goal_made);
					break;
				case 4:
					field_goal_attempted = row.getElementsByTag("td").get(i)
							.text();
					System.out.println("field_goal_attempted: "
							+ field_goal_attempted);
					break;
				case 5:
					field_goal_percentage = row.getElementsByTag("td").get(i)
							.text();
					System.out.println("field_goal_percentage: "
							+ field_goal_percentage);
					break;
				case 6:
					three_points_made = row.getElementsByTag("td").get(i)
							.text();
					System.out.println("three_points_made: "
							+ three_points_made);
					break;
				case 7:
					three_points_attempted = row.getElementsByTag("td").get(i)
							.text();
					System.out.println("three_points_attempted: "
							+ three_points_attempted);
					break;
				case 8:
					three_points_percentage = row.getElementsByTag("td").get(i)
							.text();
					System.out.println("three_points_percentage: "
							+ three_points_percentage);
					break;
				case 9:
					free_throws_made = row.getElementsByTag("td").get(i).text();
					System.out.println("free_throws_made: " + free_throws_made);
					break;
				case 10:
					free_throws_attempted = row.getElementsByTag("td").get(i)
							.text();
					System.out.println("free_throws_attempted: "
							+ free_throws_attempted);
					break;
				case 11:
					free_throws_percentage = row.getElementsByTag("td").get(i)
							.text();
					System.out.println("free_throws_percentage: "
							+ free_throws_percentage);
					break;
				default:
					i = -1;
					break;
				}
			}

			try {
				BasketballObject newObj = new BasketballObject(team,
						Double.parseDouble(games_played),
						Double.parseDouble(points_per_game),
						Double.parseDouble(field_goal_made),
						Double.parseDouble(field_goal_attempted),
						Double.parseDouble(field_goal_percentage),
						Double.parseDouble(three_points_made),
						Double.parseDouble(three_points_attempted),
						Double.parseDouble(three_points_percentage),
						Double.parseDouble(free_throws_made),
						Double.parseDouble(free_throws_attempted),
						Double.parseDouble(free_throws_percentage));
				regularSeasonStats.add(newObj);
			} catch (NumberFormatException e) {
			}

			// to test list of objects us the code below:
			// System.out.println("regular season arraylist: "
			// + regularSeasonStats.size());
			//
			// for (int i = 0; i < regularSeasonStats.size(); i++) {
			// System.out.print(regularSeasonStats.get(i)
			// .getField_goal_percentage() + "\n");
			// }

		}
	}

}
