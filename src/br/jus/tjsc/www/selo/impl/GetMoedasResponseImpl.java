/*
 * XML Type:  getMoedasResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetMoedasResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getMoedasResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetMoedasResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetMoedasResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetMoedasResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOEDAS$0 = 
        new javax.xml.namespace.QName("", "moedas");
    
    
    /**
     * Gets array of all "moedas" elements
     */
    public br.jus.tjsc.www.selo.Moeda[] getMoedasArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MOEDAS$0, targetList);
            br.jus.tjsc.www.selo.Moeda[] result = new br.jus.tjsc.www.selo.Moeda[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "moedas" element
     */
    public br.jus.tjsc.www.selo.Moeda getMoedasArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Moeda target = null;
            target = (br.jus.tjsc.www.selo.Moeda)get_store().find_element_user(MOEDAS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "moedas" element
     */
    public int sizeOfMoedasArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOEDAS$0);
        }
    }
    
    /**
     * Sets array of all "moedas" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMoedasArray(br.jus.tjsc.www.selo.Moeda[] moedasArray)
    {
        check_orphaned();
        arraySetterHelper(moedasArray, MOEDAS$0);
    }
    
    /**
     * Sets ith "moedas" element
     */
    public void setMoedasArray(int i, br.jus.tjsc.www.selo.Moeda moedas)
    {
        generatedSetterHelperImpl(moedas, MOEDAS$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "moedas" element
     */
    public br.jus.tjsc.www.selo.Moeda insertNewMoedas(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Moeda target = null;
            target = (br.jus.tjsc.www.selo.Moeda)get_store().insert_element_user(MOEDAS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "moedas" element
     */
    public br.jus.tjsc.www.selo.Moeda addNewMoedas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Moeda target = null;
            target = (br.jus.tjsc.www.selo.Moeda)get_store().add_element_user(MOEDAS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "moedas" element
     */
    public void removeMoedas(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOEDAS$0, i);
        }
    }
}
