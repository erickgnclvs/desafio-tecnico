/*
 * XML Type:  getTiposDeSubestabelecimentoResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeSubestabelecimentoResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getTiposDeSubestabelecimentoResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetTiposDeSubestabelecimentoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeSubestabelecimentoResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeSubestabelecimentoResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIPOSDESUBESTABELECIMENTO$0 = 
        new javax.xml.namespace.QName("", "tiposDeSubestabelecimento");
    
    
    /**
     * Gets array of all "tiposDeSubestabelecimento" elements
     */
    public br.jus.tjsc.www.selo.TipoSubestabelecimento[] getTiposDeSubestabelecimentoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIPOSDESUBESTABELECIMENTO$0, targetList);
            br.jus.tjsc.www.selo.TipoSubestabelecimento[] result = new br.jus.tjsc.www.selo.TipoSubestabelecimento[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tiposDeSubestabelecimento" element
     */
    public br.jus.tjsc.www.selo.TipoSubestabelecimento getTiposDeSubestabelecimentoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoSubestabelecimento target = null;
            target = (br.jus.tjsc.www.selo.TipoSubestabelecimento)get_store().find_element_user(TIPOSDESUBESTABELECIMENTO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tiposDeSubestabelecimento" element
     */
    public int sizeOfTiposDeSubestabelecimentoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPOSDESUBESTABELECIMENTO$0);
        }
    }
    
    /**
     * Sets array of all "tiposDeSubestabelecimento" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTiposDeSubestabelecimentoArray(br.jus.tjsc.www.selo.TipoSubestabelecimento[] tiposDeSubestabelecimentoArray)
    {
        check_orphaned();
        arraySetterHelper(tiposDeSubestabelecimentoArray, TIPOSDESUBESTABELECIMENTO$0);
    }
    
    /**
     * Sets ith "tiposDeSubestabelecimento" element
     */
    public void setTiposDeSubestabelecimentoArray(int i, br.jus.tjsc.www.selo.TipoSubestabelecimento tiposDeSubestabelecimento)
    {
        generatedSetterHelperImpl(tiposDeSubestabelecimento, TIPOSDESUBESTABELECIMENTO$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tiposDeSubestabelecimento" element
     */
    public br.jus.tjsc.www.selo.TipoSubestabelecimento insertNewTiposDeSubestabelecimento(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoSubestabelecimento target = null;
            target = (br.jus.tjsc.www.selo.TipoSubestabelecimento)get_store().insert_element_user(TIPOSDESUBESTABELECIMENTO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tiposDeSubestabelecimento" element
     */
    public br.jus.tjsc.www.selo.TipoSubestabelecimento addNewTiposDeSubestabelecimento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoSubestabelecimento target = null;
            target = (br.jus.tjsc.www.selo.TipoSubestabelecimento)get_store().add_element_user(TIPOSDESUBESTABELECIMENTO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tiposDeSubestabelecimento" element
     */
    public void removeTiposDeSubestabelecimento(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPOSDESUBESTABELECIMENTO$0, i);
        }
    }
}
