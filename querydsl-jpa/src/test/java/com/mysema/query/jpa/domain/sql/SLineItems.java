package com.mysema.query.jpa.domain.sql;

import javax.annotation.Generated;

import com.mysema.query.sql.ColumnMetadata;
import com.mysema.query.types.Path;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.NumberPath;
import static com.mysema.query.types.PathMetadataFactory.forVariable;


/**
 * SLineItems is a Querydsl query type for SLineItems
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class SLineItems extends com.mysema.query.sql.RelationalPathBase<SLineItems> {

    private static final long serialVersionUID = 302253659;

    public static final SLineItems LineItems = new SLineItems("LineItems");

    public final NumberPath<Integer> _index = createNumber("_index", Integer.class);

    public final NumberPath<Long> lineItemsId = createNumber("lineItemsId", Long.class);

    public final NumberPath<Long> order_id = createNumber("order_id", Long.class);

    public final com.mysema.query.sql.PrimaryKey<SLineItems> primary = createPrimaryKey(_index, order_id);

    public final com.mysema.query.sql.ForeignKey<SOrder> fkb2e400cb968f515 = createForeignKey(order_id, "id");

    public final com.mysema.query.sql.ForeignKey<SItem> fkb2e400c3d8e44c3 = createForeignKey(lineItemsId, "id");

    public SLineItems(String variable) {
        super(SLineItems.class, forVariable(variable), "", "LineItems");
        addMetadata();
    }

    public SLineItems(String variable, String schema, String table) {
        super(SLineItems.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SLineItems(Path<? extends SLineItems> path) {
        super(path.getType(), path.getMetadata(), "", "LineItems");
        addMetadata();
    }

    public SLineItems(PathMetadata<?> metadata) {
        super(SLineItems.class, metadata, "", "LineItems");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(_index, ColumnMetadata.named("_index").withIndex(3).ofType(4).withSize(10).notNull());
        addMetadata(lineItemsId, ColumnMetadata.named("lineItems_id").withIndex(2).ofType(-5).withSize(19).notNull());
        addMetadata(order_id, ColumnMetadata.named("order__id").withIndex(1).ofType(-5).withSize(19).notNull());
    }

}

