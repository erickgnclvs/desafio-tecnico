/*
 * XML Type:  getCartorioServentuarios20Response
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetCartorioServentuarios20Response
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getCartorioServentuarios20Response(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetCartorioServentuarios20ResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetCartorioServentuarios20Response
{
    private static final long serialVersionUID = 1L;
    
    public GetCartorioServentuarios20ResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CARTORIOSERVENTUARIOS20$0 = 
        new javax.xml.namespace.QName("", "cartorioServentuarios20");
    
    
    /**
     * Gets array of all "cartorioServentuarios20" elements
     */
    public br.jus.tjsc.www.selo.CartorioServentuario20[] getCartorioServentuarios20Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CARTORIOSERVENTUARIOS20$0, targetList);
            br.jus.tjsc.www.selo.CartorioServentuario20[] result = new br.jus.tjsc.www.selo.CartorioServentuario20[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cartorioServentuarios20" element
     */
    public br.jus.tjsc.www.selo.CartorioServentuario20 getCartorioServentuarios20Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.CartorioServentuario20 target = null;
            target = (br.jus.tjsc.www.selo.CartorioServentuario20)get_store().find_element_user(CARTORIOSERVENTUARIOS20$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cartorioServentuarios20" element
     */
    public int sizeOfCartorioServentuarios20Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CARTORIOSERVENTUARIOS20$0);
        }
    }
    
    /**
     * Sets array of all "cartorioServentuarios20" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCartorioServentuarios20Array(br.jus.tjsc.www.selo.CartorioServentuario20[] cartorioServentuarios20Array)
    {
        check_orphaned();
        arraySetterHelper(cartorioServentuarios20Array, CARTORIOSERVENTUARIOS20$0);
    }
    
    /**
     * Sets ith "cartorioServentuarios20" element
     */
    public void setCartorioServentuarios20Array(int i, br.jus.tjsc.www.selo.CartorioServentuario20 cartorioServentuarios20)
    {
        generatedSetterHelperImpl(cartorioServentuarios20, CARTORIOSERVENTUARIOS20$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cartorioServentuarios20" element
     */
    public br.jus.tjsc.www.selo.CartorioServentuario20 insertNewCartorioServentuarios20(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.CartorioServentuario20 target = null;
            target = (br.jus.tjsc.www.selo.CartorioServentuario20)get_store().insert_element_user(CARTORIOSERVENTUARIOS20$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cartorioServentuarios20" element
     */
    public br.jus.tjsc.www.selo.CartorioServentuario20 addNewCartorioServentuarios20()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.CartorioServentuario20 target = null;
            target = (br.jus.tjsc.www.selo.CartorioServentuario20)get_store().add_element_user(CARTORIOSERVENTUARIOS20$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "cartorioServentuarios20" element
     */
    public void removeCartorioServentuarios20(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CARTORIOSERVENTUARIOS20$0, i);
        }
    }
}
