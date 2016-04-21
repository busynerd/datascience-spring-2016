package edu.csula.datascience.jsouptest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class NBAPageCollector {

	public static void main(String[] args) {

		List<String> stats = new ArrayList<String>();

		Document doc;

		try {
			doc = Jsoup
					.connect(
							"http://www.cbssports.com/nba/stats/teamsort/NBA/year-2015-season-regularseason-category-scoringpergame-type-opponent")
					.get();

			for (Element row : doc.select("tr")) {
				stats.add(row.text());
			}
			
			// print to console just to test 
			for (int i = 2; i < stats.size(); i++){
				System.out.println(stats.get(i));
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
