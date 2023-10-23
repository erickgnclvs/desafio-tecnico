/*
 * XML Type:  getTiposDeServentuarioResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeServentuarioResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getTiposDeServentuarioResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetTiposDeServentuarioResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeServentuarioResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeServentuarioResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIPOSDESERVENTUARIO$0 = 
        new javax.xml.namespace.QName("", "tiposDeServentuario");
    
    
    /**
     * Gets array of all "tiposDeServentuario" elements
     */
    public br.jus.tjsc.www.selo.TipoServentuario[] getTiposDeServentuarioArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIPOSDESERVENTUARIO$0, targetList);
            br.jus.tjsc.www.selo.TipoServentuario[] result = new br.jus.tjsc.www.selo.TipoServentuario[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tiposDeServentuario" element
     */
    public br.jus.tjsc.www.selo.TipoServentuario getTiposDeServentuarioArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoServentuario target = null;
            target = (br.jus.tjsc.www.selo.TipoServentuario)get_store().find_element_user(TIPOSDESERVENTUARIO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tiposDeServentuario" element
     */
    public int sizeOfTiposDeServentuarioArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPOSDESERVENTUARIO$0);
        }
    }
    
    /**
     * Sets array of all "tiposDeServentuario" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTiposDeServentuarioArray(br.jus.tjsc.www.selo.TipoServentuario[] tiposDeServentuarioArray)
    {
        check_orphaned();
        arraySetterHelper(tiposDeServentuarioArray, TIPOSDESERVENTUARIO$0);
    }
    
    /**
     * Sets ith "tiposDeServentuario" element
     */
    public void setTiposDeServentuarioArray(int i, br.jus.tjsc.www.selo.TipoServentuario tiposDeServentuario)
    {
        generatedSetterHelperImpl(tiposDeServentuario, TIPOSDESERVENTUARIO$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tiposDeServentuario" element
     */
    public br.jus.tjsc.www.selo.TipoServentuario insertNewTiposDeServentuario(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoServentuario target = null;
            target = (br.jus.tjsc.www.selo.TipoServentuario)get_store().insert_element_user(TIPOSDESERVENTUARIO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tiposDeServentuario" element
     */
    public br.jus.tjsc.www.selo.TipoServentuario addNewTiposDeServentuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoServentuario target = null;
            target = (br.jus.tjsc.www.selo.TipoServentuario)get_store().add_element_user(TIPOSDESERVENTUARIO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tiposDeServentuario" element
     */
    public void removeTiposDeServentuario(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPOSDESERVENTUARIO$0, i);
        }
    }
}
