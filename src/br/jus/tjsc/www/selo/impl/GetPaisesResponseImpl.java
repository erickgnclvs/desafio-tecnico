/*
 * XML Type:  getPaisesResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetPaisesResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getPaisesResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetPaisesResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetPaisesResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetPaisesResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAISES$0 = 
        new javax.xml.namespace.QName("", "paises");
    
    
    /**
     * Gets array of all "paises" elements
     */
    public br.jus.tjsc.www.selo.Pais[] getPaisesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PAISES$0, targetList);
            br.jus.tjsc.www.selo.Pais[] result = new br.jus.tjsc.www.selo.Pais[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "paises" element
     */
    public br.jus.tjsc.www.selo.Pais getPaisesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Pais target = null;
            target = (br.jus.tjsc.www.selo.Pais)get_store().find_element_user(PAISES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "paises" element
     */
    public int sizeOfPaisesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAISES$0);
        }
    }
    
    /**
     * Sets array of all "paises" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPaisesArray(br.jus.tjsc.www.selo.Pais[] paisesArray)
    {
        check_orphaned();
        arraySetterHelper(paisesArray, PAISES$0);
    }
    
    /**
     * Sets ith "paises" element
     */
    public void setPaisesArray(int i, br.jus.tjsc.www.selo.Pais paises)
    {
        generatedSetterHelperImpl(paises, PAISES$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "paises" element
     */
    public br.jus.tjsc.www.selo.Pais insertNewPaises(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Pais target = null;
            target = (br.jus.tjsc.www.selo.Pais)get_store().insert_element_user(PAISES$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "paises" element
     */
    public br.jus.tjsc.www.selo.Pais addNewPaises()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Pais target = null;
            target = (br.jus.tjsc.www.selo.Pais)get_store().add_element_user(PAISES$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "paises" element
     */
    public void removePaises(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAISES$0, i);
        }
    }
}
