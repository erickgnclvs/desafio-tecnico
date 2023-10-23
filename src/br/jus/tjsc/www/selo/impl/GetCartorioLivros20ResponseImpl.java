/*
 * XML Type:  getCartorioLivros20Response
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetCartorioLivros20Response
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getCartorioLivros20Response(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetCartorioLivros20ResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetCartorioLivros20Response
{
    private static final long serialVersionUID = 1L;
    
    public GetCartorioLivros20ResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CARTORIOLIVROS20$0 = 
        new javax.xml.namespace.QName("", "cartorioLivros20");
    
    
    /**
     * Gets array of all "cartorioLivros20" elements
     */
    public br.jus.tjsc.www.selo.CartorioLivro20[] getCartorioLivros20Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CARTORIOLIVROS20$0, targetList);
            br.jus.tjsc.www.selo.CartorioLivro20[] result = new br.jus.tjsc.www.selo.CartorioLivro20[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cartorioLivros20" element
     */
    public br.jus.tjsc.www.selo.CartorioLivro20 getCartorioLivros20Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.CartorioLivro20 target = null;
            target = (br.jus.tjsc.www.selo.CartorioLivro20)get_store().find_element_user(CARTORIOLIVROS20$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cartorioLivros20" element
     */
    public int sizeOfCartorioLivros20Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CARTORIOLIVROS20$0);
        }
    }
    
    /**
     * Sets array of all "cartorioLivros20" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCartorioLivros20Array(br.jus.tjsc.www.selo.CartorioLivro20[] cartorioLivros20Array)
    {
        check_orphaned();
        arraySetterHelper(cartorioLivros20Array, CARTORIOLIVROS20$0);
    }
    
    /**
     * Sets ith "cartorioLivros20" element
     */
    public void setCartorioLivros20Array(int i, br.jus.tjsc.www.selo.CartorioLivro20 cartorioLivros20)
    {
        generatedSetterHelperImpl(cartorioLivros20, CARTORIOLIVROS20$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cartorioLivros20" element
     */
    public br.jus.tjsc.www.selo.CartorioLivro20 insertNewCartorioLivros20(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.CartorioLivro20 target = null;
            target = (br.jus.tjsc.www.selo.CartorioLivro20)get_store().insert_element_user(CARTORIOLIVROS20$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cartorioLivros20" element
     */
    public br.jus.tjsc.www.selo.CartorioLivro20 addNewCartorioLivros20()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.CartorioLivro20 target = null;
            target = (br.jus.tjsc.www.selo.CartorioLivro20)get_store().add_element_user(CARTORIOLIVROS20$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "cartorioLivros20" element
     */
    public void removeCartorioLivros20(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CARTORIOLIVROS20$0, i);
        }
    }
}
