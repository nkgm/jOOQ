/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class VAuthor extends org.jooq.impl.TableImpl<org.jooq.test.cubrid.generatedclasses.tables.records.VAuthorRecord> {

	private static final long serialVersionUID = -1834135392;

	/**
	 * The singleton instance of <code>v_author</code>
	 */
	public static final org.jooq.test.cubrid.generatedclasses.tables.VAuthor V_AUTHOR = new org.jooq.test.cubrid.generatedclasses.tables.VAuthor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.cubrid.generatedclasses.tables.records.VAuthorRecord> getRecordType() {
		return org.jooq.test.cubrid.generatedclasses.tables.records.VAuthorRecord.class;
	}

	/**
	 * The column <code>v_author.id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, V_AUTHOR);

	/**
	 * The column <code>v_author.first_name</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.VAuthorRecord, java.lang.String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR.length(50), V_AUTHOR);

	/**
	 * The column <code>v_author.last_name</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.VAuthorRecord, java.lang.String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR.length(50), V_AUTHOR);

	/**
	 * The column <code>v_author.date_of_birth</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.VAuthorRecord, java.sql.Date> DATE_OF_BIRTH = createField("date_of_birth", org.jooq.impl.SQLDataType.DATE, V_AUTHOR);

	/**
	 * The column <code>v_author.year_of_birth</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer> YEAR_OF_BIRTH = createField("year_of_birth", org.jooq.impl.SQLDataType.INTEGER, V_AUTHOR);

	/**
	 * The column <code>v_author.address</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.VAuthorRecord, java.lang.String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(200), V_AUTHOR);

	/**
	 * No further instances allowed
	 */
	private VAuthor() {
		super("v_author", org.jooq.test.cubrid.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}
}
