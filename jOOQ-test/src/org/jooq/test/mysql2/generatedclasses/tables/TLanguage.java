/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding language master data
 */
@java.lang.SuppressWarnings("all")
public class TLanguage extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.mysql2.generatedclasses.tables.records.TLanguageRecord> {

	private static final long serialVersionUID = -745339804;

	/**
	 * The singleton instance of test2.t_language
	 */
	public static final org.jooq.test.mysql2.generatedclasses.tables.TLanguage T_LANGUAGE = new org.jooq.test.mysql2.generatedclasses.tables.TLanguage();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.TLanguageRecord> getRecordType() {
		return org.jooq.test.mysql2.generatedclasses.tables.records.TLanguageRecord.class;
	}

	/**
	 * The language ISO code
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TLanguageRecord, java.lang.String> CD = createField("CD", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The language description
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TLanguageRecord, java.lang.String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>test2.t_language.description_english</code>
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TLanguageRecord, java.lang.String> DESCRIPTION_ENGLISH = createField("description_english", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The language ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TLanguageRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	public TLanguage() {
		super("t_language", org.jooq.test.mysql2.generatedclasses.Test2.TEST2);
	}

	public TLanguage(java.lang.String alias) {
		super(alias, org.jooq.test.mysql2.generatedclasses.Test2.TEST2, org.jooq.test.mysql2.generatedclasses.tables.TLanguage.T_LANGUAGE);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TLanguageRecord> getMainKey() {
		return org.jooq.test.mysql2.generatedclasses.Keys.KEY_T_LANGUAGE_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TLanguageRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TLanguageRecord>>asList(org.jooq.test.mysql2.generatedclasses.Keys.KEY_T_LANGUAGE_PRIMARY);
	}

	@Override
	public org.jooq.test.mysql2.generatedclasses.tables.TLanguage as(java.lang.String alias) {
		return new org.jooq.test.mysql2.generatedclasses.tables.TLanguage(alias);
	}
}