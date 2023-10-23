/*
 * XML Type:  getJuizesDePazResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetJuizesDePazResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getJuizesDePazResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetJuizesDePazResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetJuizesDePazResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetJuizesDePazResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JUIZESDEPAZ$0 = 
        new javax.xml.namespace.QName("", "juizesDePaz");
    
    
    /**
     * Gets array of all "juizesDePaz" elements
     */
    public br.jus.tjsc.www.selo.JuizPaz[] getJuizesDePazArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(JUIZESDEPAZ$0, targetList);
            br.jus.tjsc.www.selo.JuizPaz[] result = new br.jus.tjsc.www.selo.JuizPaz[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "juizesDePaz" element
     */
    public br.jus.tjsc.www.selo.JuizPaz getJuizesDePazArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.JuizPaz target = null;
            target = (br.jus.tjsc.www.selo.JuizPaz)get_store().find_element_user(JUIZESDEPAZ$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "juizesDePaz" element
     */
    public int sizeOfJuizesDePazArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JUIZESDEPAZ$0);
        }
    }
    
    /**
     * Sets array of all "juizesDePaz" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setJuizesDePazArray(br.jus.tjsc.www.selo.JuizPaz[] juizesDePazArray)
    {
        check_orphaned();
        arraySetterHelper(juizesDePazArray, JUIZESDEPAZ$0);
    }
    
    /**
     * Sets ith "juizesDePaz" element
     */
    public void setJuizesDePazArray(int i, br.jus.tjsc.www.selo.JuizPaz juizesDePaz)
    {
        generatedSetterHelperImpl(juizesDePaz, JUIZESDEPAZ$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "juizesDePaz" element
     */
    public br.jus.tjsc.www.selo.JuizPaz insertNewJuizesDePaz(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.JuizPaz target = null;
            target = (br.jus.tjsc.www.selo.JuizPaz)get_store().insert_element_user(JUIZESDEPAZ$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "juizesDePaz" element
     */
    public br.jus.tjsc.www.selo.JuizPaz addNewJuizesDePaz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.JuizPaz target = null;
            target = (br.jus.tjsc.www.selo.JuizPaz)get_store().add_element_user(JUIZESDEPAZ$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "juizesDePaz" element
     */
    public void removeJuizesDePaz(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JUIZESDEPAZ$0, i);
        }
    }
}
