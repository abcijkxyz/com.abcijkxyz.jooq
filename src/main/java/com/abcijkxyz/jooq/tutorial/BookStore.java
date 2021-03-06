package com.abcijkxyz.jooq.tutorial;

import static com.abcijkxyz.jooq.model.Tables.AUTHOR;
import static com.abcijkxyz.jooq.model.Tables.BOOK;
import static com.abcijkxyz.jooq.model.Tables.BOOK_AUTHOR_REL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.jooq.DSLContext;
import org.jooq.Record2;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

public class BookStore {
	public void run() throws SQLException {
		Connection conn = getConnection();
		DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

		// query books for author named 'selena'
		Result<Record2<Long, String>> result = create.select(BOOK.ID, BOOK.TITLE).from(BOOK).join(BOOK_AUTHOR_REL).on(BOOK_AUTHOR_REL.BOOKID.equal(BOOK.ID)).join(AUTHOR).on(BOOK_AUTHOR_REL.AUTHORID.equal(AUTHOR.ID)).where(AUTHOR.NAME.equal("selena")).orderBy(BOOK.TITLE.asc(), BOOK.ID.asc()).fetch();
		result.forEach((r) -> {
			System.out.println(String.format("%s (id: %s)", r.getValue(BOOK.TITLE), r.getValue(BOOK.ID)));
		});
		conn.close();
		System.exit(0); // it's a tutorial :)
	}

	public static void main(final String[] args) throws SQLException {
		new BookStore().run();
	}

	private Connection getConnection() {
		try {
			Class.forName(System.getProperty("jdbc.driver")).newInstance();
			return DriverManager.getConnection(System.getProperty("jdbc.url"), System.getProperty("jdbc.user"), System.getProperty("jdbc.password"));
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace(); // for tutorial's sake ;)
		}
		return null;
	}
}
