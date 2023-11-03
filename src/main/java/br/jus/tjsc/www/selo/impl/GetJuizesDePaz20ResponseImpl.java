/*
 * XML Type:  getJuizesDePaz20Response
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetJuizesDePaz20Response
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getJuizesDePaz20Response(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetJuizesDePaz20ResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetJuizesDePaz20Response
{
    private static final long serialVersionUID = 1L;
    
    public GetJuizesDePaz20ResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JUIZESDEPAZ20$0 = 
        new javax.xml.namespace.QName("", "juizesDePaz20");
    
    
    /**
     * Gets array of all "juizesDePaz20" elements
     */
    public br.jus.tjsc.www.selo.JuizPaz20[] getJuizesDePaz20Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(JUIZESDEPAZ20$0, targetList);
            br.jus.tjsc.www.selo.JuizPaz20[] result = new br.jus.tjsc.www.selo.JuizPaz20[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "juizesDePaz20" element
     */
    public br.jus.tjsc.www.selo.JuizPaz20 getJuizesDePaz20Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.JuizPaz20 target = null;
            target = (br.jus.tjsc.www.selo.JuizPaz20)get_store().find_element_user(JUIZESDEPAZ20$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "juizesDePaz20" element
     */
    public int sizeOfJuizesDePaz20Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JUIZESDEPAZ20$0);
        }
    }
    
    /**
     * Sets array of all "juizesDePaz20" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setJuizesDePaz20Array(br.jus.tjsc.www.selo.JuizPaz20[] juizesDePaz20Array)
    {
        check_orphaned();
        arraySetterHelper(juizesDePaz20Array, JUIZESDEPAZ20$0);
    }
    
    /**
     * Sets ith "juizesDePaz20" element
     */
    public void setJuizesDePaz20Array(int i, br.jus.tjsc.www.selo.JuizPaz20 juizesDePaz20)
    {
        generatedSetterHelperImpl(juizesDePaz20, JUIZESDEPAZ20$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "juizesDePaz20" element
     */
    public br.jus.tjsc.www.selo.JuizPaz20 insertNewJuizesDePaz20(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.JuizPaz20 target = null;
            target = (br.jus.tjsc.www.selo.JuizPaz20)get_store().insert_element_user(JUIZESDEPAZ20$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "juizesDePaz20" element
     */
    public br.jus.tjsc.www.selo.JuizPaz20 addNewJuizesDePaz20()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.JuizPaz20 target = null;
            target = (br.jus.tjsc.www.selo.JuizPaz20)get_store().add_element_user(JUIZESDEPAZ20$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "juizesDePaz20" element
     */
    public void removeJuizesDePaz20(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JUIZESDEPAZ20$0, i);
        }
    }
}
