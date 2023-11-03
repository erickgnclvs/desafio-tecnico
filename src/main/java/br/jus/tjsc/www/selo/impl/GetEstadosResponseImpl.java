/*
 * XML Type:  getEstadosResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetEstadosResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getEstadosResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetEstadosResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetEstadosResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetEstadosResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESTADOS$0 = 
        new javax.xml.namespace.QName("", "estados");
    
    
    /**
     * Gets array of all "estados" elements
     */
    public br.jus.tjsc.www.selo.Estado[] getEstadosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ESTADOS$0, targetList);
            br.jus.tjsc.www.selo.Estado[] result = new br.jus.tjsc.www.selo.Estado[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "estados" element
     */
    public br.jus.tjsc.www.selo.Estado getEstadosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Estado target = null;
            target = (br.jus.tjsc.www.selo.Estado)get_store().find_element_user(ESTADOS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "estados" element
     */
    public int sizeOfEstadosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ESTADOS$0);
        }
    }
    
    /**
     * Sets array of all "estados" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setEstadosArray(br.jus.tjsc.www.selo.Estado[] estadosArray)
    {
        check_orphaned();
        arraySetterHelper(estadosArray, ESTADOS$0);
    }
    
    /**
     * Sets ith "estados" element
     */
    public void setEstadosArray(int i, br.jus.tjsc.www.selo.Estado estados)
    {
        generatedSetterHelperImpl(estados, ESTADOS$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "estados" element
     */
    public br.jus.tjsc.www.selo.Estado insertNewEstados(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Estado target = null;
            target = (br.jus.tjsc.www.selo.Estado)get_store().insert_element_user(ESTADOS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "estados" element
     */
    public br.jus.tjsc.www.selo.Estado addNewEstados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Estado target = null;
            target = (br.jus.tjsc.www.selo.Estado)get_store().add_element_user(ESTADOS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "estados" element
     */
    public void removeEstados(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ESTADOS$0, i);
        }
    }
}
