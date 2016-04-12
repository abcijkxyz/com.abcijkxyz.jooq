/**
 * This class is generated by jOOQ
 */
package com.abcijkxyz.jooq.model;


import com.abcijkxyz.jooq.model.tables.Author;
import com.abcijkxyz.jooq.model.tables.Book;
import com.abcijkxyz.jooq.model.tables.BookAuthorRel;
import com.abcijkxyz.jooq.model.tables.records.AuthorRecord;
import com.abcijkxyz.jooq.model.tables.records.BookAuthorRelRecord;
import com.abcijkxyz.jooq.model.tables.records.BookRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>mydb</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<AuthorRecord> KEY_AUTHOR_PRIMARY = UniqueKeys0.KEY_AUTHOR_PRIMARY;
	public static final UniqueKey<BookRecord> KEY_BOOK_PRIMARY = UniqueKeys0.KEY_BOOK_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final ForeignKey<BookAuthorRelRecord, BookRecord> BOOK_AUTHOR_REL_IBFK_1 = ForeignKeys0.BOOK_AUTHOR_REL_IBFK_1;
	public static final ForeignKey<BookAuthorRelRecord, AuthorRecord> BOOK_AUTHOR_REL_IBFK_2 = ForeignKeys0.BOOK_AUTHOR_REL_IBFK_2;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<AuthorRecord> KEY_AUTHOR_PRIMARY = createUniqueKey(Author.AUTHOR, Author.AUTHOR.ID);
		public static final UniqueKey<BookRecord> KEY_BOOK_PRIMARY = createUniqueKey(Book.BOOK, Book.BOOK.ID);
	}

	private static class ForeignKeys0 extends AbstractKeys {
		public static final ForeignKey<BookAuthorRelRecord, BookRecord> BOOK_AUTHOR_REL_IBFK_1 = createForeignKey(com.abcijkxyz.jooq.model.Keys.KEY_BOOK_PRIMARY, BookAuthorRel.BOOK_AUTHOR_REL, BookAuthorRel.BOOK_AUTHOR_REL.BOOKID);
		public static final ForeignKey<BookAuthorRelRecord, AuthorRecord> BOOK_AUTHOR_REL_IBFK_2 = createForeignKey(com.abcijkxyz.jooq.model.Keys.KEY_AUTHOR_PRIMARY, BookAuthorRel.BOOK_AUTHOR_REL, BookAuthorRel.BOOK_AUTHOR_REL.AUTHORID);
	}
}
