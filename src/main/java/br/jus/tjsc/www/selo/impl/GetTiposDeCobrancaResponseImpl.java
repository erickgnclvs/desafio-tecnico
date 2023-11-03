/*
 * XML Type:  getTiposDeCobrancaResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeCobrancaResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getTiposDeCobrancaResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetTiposDeCobrancaResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeCobrancaResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeCobrancaResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIPOSDECOBRANCA$0 = 
        new javax.xml.namespace.QName("", "tiposDeCobranca");
    
    
    /**
     * Gets array of all "tiposDeCobranca" elements
     */
    public br.jus.tjsc.www.selo.TipoCobranca[] getTiposDeCobrancaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIPOSDECOBRANCA$0, targetList);
            br.jus.tjsc.www.selo.TipoCobranca[] result = new br.jus.tjsc.www.selo.TipoCobranca[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tiposDeCobranca" element
     */
    public br.jus.tjsc.www.selo.TipoCobranca getTiposDeCobrancaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoCobranca target = null;
            target = (br.jus.tjsc.www.selo.TipoCobranca)get_store().find_element_user(TIPOSDECOBRANCA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tiposDeCobranca" element
     */
    public int sizeOfTiposDeCobrancaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPOSDECOBRANCA$0);
        }
    }
    
    /**
     * Sets array of all "tiposDeCobranca" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTiposDeCobrancaArray(br.jus.tjsc.www.selo.TipoCobranca[] tiposDeCobrancaArray)
    {
        check_orphaned();
        arraySetterHelper(tiposDeCobrancaArray, TIPOSDECOBRANCA$0);
    }
    
    /**
     * Sets ith "tiposDeCobranca" element
     */
    public void setTiposDeCobrancaArray(int i, br.jus.tjsc.www.selo.TipoCobranca tiposDeCobranca)
    {
        generatedSetterHelperImpl(tiposDeCobranca, TIPOSDECOBRANCA$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tiposDeCobranca" element
     */
    public br.jus.tjsc.www.selo.TipoCobranca insertNewTiposDeCobranca(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoCobranca target = null;
            target = (br.jus.tjsc.www.selo.TipoCobranca)get_store().insert_element_user(TIPOSDECOBRANCA$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tiposDeCobranca" element
     */
    public br.jus.tjsc.www.selo.TipoCobranca addNewTiposDeCobranca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoCobranca target = null;
            target = (br.jus.tjsc.www.selo.TipoCobranca)get_store().add_element_user(TIPOSDECOBRANCA$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tiposDeCobranca" element
     */
    public void removeTiposDeCobranca(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPOSDECOBRANCA$0, i);
        }
    }
}
