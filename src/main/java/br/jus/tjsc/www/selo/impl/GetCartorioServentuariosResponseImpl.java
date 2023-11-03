/*
 * XML Type:  getCartorioServentuariosResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetCartorioServentuariosResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getCartorioServentuariosResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetCartorioServentuariosResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetCartorioServentuariosResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetCartorioServentuariosResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CARTORIOSERVENTUARIOS$0 = 
        new javax.xml.namespace.QName("", "cartorioServentuarios");
    
    
    /**
     * Gets array of all "cartorioServentuarios" elements
     */
    public br.jus.tjsc.www.selo.CartorioServentuario[] getCartorioServentuariosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CARTORIOSERVENTUARIOS$0, targetList);
            br.jus.tjsc.www.selo.CartorioServentuario[] result = new br.jus.tjsc.www.selo.CartorioServentuario[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cartorioServentuarios" element
     */
    public br.jus.tjsc.www.selo.CartorioServentuario getCartorioServentuariosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.CartorioServentuario target = null;
            target = (br.jus.tjsc.www.selo.CartorioServentuario)get_store().find_element_user(CARTORIOSERVENTUARIOS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cartorioServentuarios" element
     */
    public int sizeOfCartorioServentuariosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CARTORIOSERVENTUARIOS$0);
        }
    }
    
    /**
     * Sets array of all "cartorioServentuarios" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCartorioServentuariosArray(br.jus.tjsc.www.selo.CartorioServentuario[] cartorioServentuariosArray)
    {
        check_orphaned();
        arraySetterHelper(cartorioServentuariosArray, CARTORIOSERVENTUARIOS$0);
    }
    
    /**
     * Sets ith "cartorioServentuarios" element
     */
    public void setCartorioServentuariosArray(int i, br.jus.tjsc.www.selo.CartorioServentuario cartorioServentuarios)
    {
        generatedSetterHelperImpl(cartorioServentuarios, CARTORIOSERVENTUARIOS$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cartorioServentuarios" element
     */
    public br.jus.tjsc.www.selo.CartorioServentuario insertNewCartorioServentuarios(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.CartorioServentuario target = null;
            target = (br.jus.tjsc.www.selo.CartorioServentuario)get_store().insert_element_user(CARTORIOSERVENTUARIOS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cartorioServentuarios" element
     */
    public br.jus.tjsc.www.selo.CartorioServentuario addNewCartorioServentuarios()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.CartorioServentuario target = null;
            target = (br.jus.tjsc.www.selo.CartorioServentuario)get_store().add_element_user(CARTORIOSERVENTUARIOS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "cartorioServentuarios" element
     */
    public void removeCartorioServentuarios(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CARTORIOSERVENTUARIOS$0, i);
        }
    }
}
