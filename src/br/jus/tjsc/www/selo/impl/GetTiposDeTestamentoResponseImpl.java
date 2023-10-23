/*
 * XML Type:  getTiposDeTestamentoResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeTestamentoResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getTiposDeTestamentoResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetTiposDeTestamentoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeTestamentoResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeTestamentoResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIPOSDETESTAMENTO$0 = 
        new javax.xml.namespace.QName("", "tiposDeTestamento");
    
    
    /**
     * Gets array of all "tiposDeTestamento" elements
     */
    public br.jus.tjsc.www.selo.TipoTestamento[] getTiposDeTestamentoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIPOSDETESTAMENTO$0, targetList);
            br.jus.tjsc.www.selo.TipoTestamento[] result = new br.jus.tjsc.www.selo.TipoTestamento[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tiposDeTestamento" element
     */
    public br.jus.tjsc.www.selo.TipoTestamento getTiposDeTestamentoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoTestamento target = null;
            target = (br.jus.tjsc.www.selo.TipoTestamento)get_store().find_element_user(TIPOSDETESTAMENTO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tiposDeTestamento" element
     */
    public int sizeOfTiposDeTestamentoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPOSDETESTAMENTO$0);
        }
    }
    
    /**
     * Sets array of all "tiposDeTestamento" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTiposDeTestamentoArray(br.jus.tjsc.www.selo.TipoTestamento[] tiposDeTestamentoArray)
    {
        check_orphaned();
        arraySetterHelper(tiposDeTestamentoArray, TIPOSDETESTAMENTO$0);
    }
    
    /**
     * Sets ith "tiposDeTestamento" element
     */
    public void setTiposDeTestamentoArray(int i, br.jus.tjsc.www.selo.TipoTestamento tiposDeTestamento)
    {
        generatedSetterHelperImpl(tiposDeTestamento, TIPOSDETESTAMENTO$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tiposDeTestamento" element
     */
    public br.jus.tjsc.www.selo.TipoTestamento insertNewTiposDeTestamento(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoTestamento target = null;
            target = (br.jus.tjsc.www.selo.TipoTestamento)get_store().insert_element_user(TIPOSDETESTAMENTO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tiposDeTestamento" element
     */
    public br.jus.tjsc.www.selo.TipoTestamento addNewTiposDeTestamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoTestamento target = null;
            target = (br.jus.tjsc.www.selo.TipoTestamento)get_store().add_element_user(TIPOSDETESTAMENTO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tiposDeTestamento" element
     */
    public void removeTiposDeTestamento(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPOSDETESTAMENTO$0, i);
        }
    }
}
