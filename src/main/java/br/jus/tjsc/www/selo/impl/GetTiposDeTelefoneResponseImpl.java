/*
 * XML Type:  getTiposDeTelefoneResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeTelefoneResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getTiposDeTelefoneResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetTiposDeTelefoneResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeTelefoneResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeTelefoneResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIPOSDETELEFONE$0 = 
        new javax.xml.namespace.QName("", "tiposDeTelefone");
    
    
    /**
     * Gets array of all "tiposDeTelefone" elements
     */
    public br.jus.tjsc.www.selo.TipoTelefone[] getTiposDeTelefoneArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIPOSDETELEFONE$0, targetList);
            br.jus.tjsc.www.selo.TipoTelefone[] result = new br.jus.tjsc.www.selo.TipoTelefone[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tiposDeTelefone" element
     */
    public br.jus.tjsc.www.selo.TipoTelefone getTiposDeTelefoneArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoTelefone target = null;
            target = (br.jus.tjsc.www.selo.TipoTelefone)get_store().find_element_user(TIPOSDETELEFONE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tiposDeTelefone" element
     */
    public int sizeOfTiposDeTelefoneArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPOSDETELEFONE$0);
        }
    }
    
    /**
     * Sets array of all "tiposDeTelefone" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTiposDeTelefoneArray(br.jus.tjsc.www.selo.TipoTelefone[] tiposDeTelefoneArray)
    {
        check_orphaned();
        arraySetterHelper(tiposDeTelefoneArray, TIPOSDETELEFONE$0);
    }
    
    /**
     * Sets ith "tiposDeTelefone" element
     */
    public void setTiposDeTelefoneArray(int i, br.jus.tjsc.www.selo.TipoTelefone tiposDeTelefone)
    {
        generatedSetterHelperImpl(tiposDeTelefone, TIPOSDETELEFONE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tiposDeTelefone" element
     */
    public br.jus.tjsc.www.selo.TipoTelefone insertNewTiposDeTelefone(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoTelefone target = null;
            target = (br.jus.tjsc.www.selo.TipoTelefone)get_store().insert_element_user(TIPOSDETELEFONE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tiposDeTelefone" element
     */
    public br.jus.tjsc.www.selo.TipoTelefone addNewTiposDeTelefone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoTelefone target = null;
            target = (br.jus.tjsc.www.selo.TipoTelefone)get_store().add_element_user(TIPOSDETELEFONE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tiposDeTelefone" element
     */
    public void removeTiposDeTelefone(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPOSDETELEFONE$0, i);
        }
    }
}
