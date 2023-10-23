/*
 * XML Type:  getTiposDeEnderecoResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeEnderecoResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getTiposDeEnderecoResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetTiposDeEnderecoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeEnderecoResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeEnderecoResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIPOSDEENDERECO$0 = 
        new javax.xml.namespace.QName("", "tiposDeEndereco");
    
    
    /**
     * Gets array of all "tiposDeEndereco" elements
     */
    public br.jus.tjsc.www.selo.TipoEndereco[] getTiposDeEnderecoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIPOSDEENDERECO$0, targetList);
            br.jus.tjsc.www.selo.TipoEndereco[] result = new br.jus.tjsc.www.selo.TipoEndereco[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tiposDeEndereco" element
     */
    public br.jus.tjsc.www.selo.TipoEndereco getTiposDeEnderecoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoEndereco target = null;
            target = (br.jus.tjsc.www.selo.TipoEndereco)get_store().find_element_user(TIPOSDEENDERECO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tiposDeEndereco" element
     */
    public int sizeOfTiposDeEnderecoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPOSDEENDERECO$0);
        }
    }
    
    /**
     * Sets array of all "tiposDeEndereco" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTiposDeEnderecoArray(br.jus.tjsc.www.selo.TipoEndereco[] tiposDeEnderecoArray)
    {
        check_orphaned();
        arraySetterHelper(tiposDeEnderecoArray, TIPOSDEENDERECO$0);
    }
    
    /**
     * Sets ith "tiposDeEndereco" element
     */
    public void setTiposDeEnderecoArray(int i, br.jus.tjsc.www.selo.TipoEndereco tiposDeEndereco)
    {
        generatedSetterHelperImpl(tiposDeEndereco, TIPOSDEENDERECO$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tiposDeEndereco" element
     */
    public br.jus.tjsc.www.selo.TipoEndereco insertNewTiposDeEndereco(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoEndereco target = null;
            target = (br.jus.tjsc.www.selo.TipoEndereco)get_store().insert_element_user(TIPOSDEENDERECO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tiposDeEndereco" element
     */
    public br.jus.tjsc.www.selo.TipoEndereco addNewTiposDeEndereco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoEndereco target = null;
            target = (br.jus.tjsc.www.selo.TipoEndereco)get_store().add_element_user(TIPOSDEENDERECO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tiposDeEndereco" element
     */
    public void removeTiposDeEndereco(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPOSDEENDERECO$0, i);
        }
    }
}
