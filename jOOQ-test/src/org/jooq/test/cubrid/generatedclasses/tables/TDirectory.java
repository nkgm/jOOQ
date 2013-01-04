/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TDirectory extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.cubrid.generatedclasses.tables.records.TDirectoryRecord> {

	private static final long serialVersionUID = 53108084;

	/**
	 * The singleton instance of <code>t_directory</code>
	 */
	public static final org.jooq.test.cubrid.generatedclasses.tables.TDirectory T_DIRECTORY = new org.jooq.test.cubrid.generatedclasses.tables.TDirectory();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.cubrid.generatedclasses.tables.records.TDirectoryRecord> getRecordType() {
		return org.jooq.test.cubrid.generatedclasses.tables.records.TDirectoryRecord.class;
	}

	/**
	 * The column <code>t_directory.id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TDirectoryRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, T_DIRECTORY);

	/**
	 * The column <code>t_directory.parent_id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TDirectoryRecord, java.lang.Integer> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.INTEGER, T_DIRECTORY);

	/**
	 * The column <code>t_directory.is_directory</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TDirectoryRecord, java.lang.Integer> IS_DIRECTORY = createField("is_directory", org.jooq.impl.SQLDataType.INTEGER, T_DIRECTORY);

	/**
	 * The column <code>t_directory.name</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TDirectoryRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_DIRECTORY);

	/**
	 * No further instances allowed
	 */
	private TDirectory() {
		super("t_directory", org.jooq.test.cubrid.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.TDirectoryRecord> getMainKey() {
		return org.jooq.test.cubrid.generatedclasses.Keys.T_DIRECTORY__PK_T_DIRECTORY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.TDirectoryRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.TDirectoryRecord>>asList(org.jooq.test.cubrid.generatedclasses.Keys.T_DIRECTORY__PK_T_DIRECTORY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.cubrid.generatedclasses.tables.records.TDirectoryRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.cubrid.generatedclasses.tables.records.TDirectoryRecord, ?>>asList(org.jooq.test.cubrid.generatedclasses.Keys.T_DIRECTORY__PK_T_DIRECTORY_SELF);
	}
}
