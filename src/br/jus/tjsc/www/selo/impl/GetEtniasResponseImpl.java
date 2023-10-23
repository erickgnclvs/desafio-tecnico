/*
 * XML Type:  getEtniasResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetEtniasResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getEtniasResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetEtniasResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetEtniasResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetEtniasResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ETNIAS$0 = 
        new javax.xml.namespace.QName("", "etnias");
    
    
    /**
     * Gets array of all "etnias" elements
     */
    public br.jus.tjsc.www.selo.Etnia[] getEtniasArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ETNIAS$0, targetList);
            br.jus.tjsc.www.selo.Etnia[] result = new br.jus.tjsc.www.selo.Etnia[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "etnias" element
     */
    public br.jus.tjsc.www.selo.Etnia getEtniasArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Etnia target = null;
            target = (br.jus.tjsc.www.selo.Etnia)get_store().find_element_user(ETNIAS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "etnias" element
     */
    public int sizeOfEtniasArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ETNIAS$0);
        }
    }
    
    /**
     * Sets array of all "etnias" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setEtniasArray(br.jus.tjsc.www.selo.Etnia[] etniasArray)
    {
        check_orphaned();
        arraySetterHelper(etniasArray, ETNIAS$0);
    }
    
    /**
     * Sets ith "etnias" element
     */
    public void setEtniasArray(int i, br.jus.tjsc.www.selo.Etnia etnias)
    {
        generatedSetterHelperImpl(etnias, ETNIAS$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "etnias" element
     */
    public br.jus.tjsc.www.selo.Etnia insertNewEtnias(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Etnia target = null;
            target = (br.jus.tjsc.www.selo.Etnia)get_store().insert_element_user(ETNIAS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "etnias" element
     */
    public br.jus.tjsc.www.selo.Etnia addNewEtnias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Etnia target = null;
            target = (br.jus.tjsc.www.selo.Etnia)get_store().add_element_user(ETNIAS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "etnias" element
     */
    public void removeEtnias(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ETNIAS$0, i);
        }
    }
}
