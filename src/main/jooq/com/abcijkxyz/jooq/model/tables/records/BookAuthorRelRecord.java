/**
 * This class is generated by jOOQ
 */
package com.abcijkxyz.jooq.model.tables.records;


import com.abcijkxyz.jooq.model.tables.BookAuthorRel;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BookAuthorRelRecord extends TableRecordImpl<BookAuthorRelRecord> implements Record2<Long, Long> {

	private static final long serialVersionUID = -563356780;

	/**
	 * Setter for <code>mydb.book_author_rel.bookid</code>.
	 */
	public void setBookid(Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mydb.book_author_rel.bookid</code>.
	 */
	public Long getBookid() {
		return (Long) getValue(0);
	}

	/**
	 * Setter for <code>mydb.book_author_rel.authorid</code>.
	 */
	public void setAuthorid(Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mydb.book_author_rel.authorid</code>.
	 */
	public Long getAuthorid() {
		return (Long) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Long, Long> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Long, Long> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return BookAuthorRel.BOOK_AUTHOR_REL.BOOKID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field2() {
		return BookAuthorRel.BOOK_AUTHOR_REL.AUTHORID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getBookid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value2() {
		return getAuthorid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BookAuthorRelRecord value1(Long value) {
		setBookid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BookAuthorRelRecord value2(Long value) {
		setAuthorid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BookAuthorRelRecord values(Long value1, Long value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached BookAuthorRelRecord
	 */
	public BookAuthorRelRecord() {
		super(BookAuthorRel.BOOK_AUTHOR_REL);
	}

	/**
	 * Create a detached, initialised BookAuthorRelRecord
	 */
	public BookAuthorRelRecord(Long bookid, Long authorid) {
		super(BookAuthorRel.BOOK_AUTHOR_REL);

		setValue(0, bookid);
		setValue(1, authorid);
	}
}