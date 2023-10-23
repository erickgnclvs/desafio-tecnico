/*
 * XML Type:  getComarcasResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetComarcasResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getComarcasResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetComarcasResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetComarcasResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetComarcasResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMARCAS$0 = 
        new javax.xml.namespace.QName("", "comarcas");
    
    
    /**
     * Gets array of all "comarcas" elements
     */
    public br.jus.tjsc.www.selo.Comarca[] getComarcasArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMARCAS$0, targetList);
            br.jus.tjsc.www.selo.Comarca[] result = new br.jus.tjsc.www.selo.Comarca[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "comarcas" element
     */
    public br.jus.tjsc.www.selo.Comarca getComarcasArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Comarca target = null;
            target = (br.jus.tjsc.www.selo.Comarca)get_store().find_element_user(COMARCAS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "comarcas" element
     */
    public int sizeOfComarcasArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMARCAS$0);
        }
    }
    
    /**
     * Sets array of all "comarcas" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setComarcasArray(br.jus.tjsc.www.selo.Comarca[] comarcasArray)
    {
        check_orphaned();
        arraySetterHelper(comarcasArray, COMARCAS$0);
    }
    
    /**
     * Sets ith "comarcas" element
     */
    public void setComarcasArray(int i, br.jus.tjsc.www.selo.Comarca comarcas)
    {
        generatedSetterHelperImpl(comarcas, COMARCAS$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "comarcas" element
     */
    public br.jus.tjsc.www.selo.Comarca insertNewComarcas(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Comarca target = null;
            target = (br.jus.tjsc.www.selo.Comarca)get_store().insert_element_user(COMARCAS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "comarcas" element
     */
    public br.jus.tjsc.www.selo.Comarca addNewComarcas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Comarca target = null;
            target = (br.jus.tjsc.www.selo.Comarca)get_store().add_element_user(COMARCAS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "comarcas" element
     */
    public void removeComarcas(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMARCAS$0, i);
        }
    }
}
