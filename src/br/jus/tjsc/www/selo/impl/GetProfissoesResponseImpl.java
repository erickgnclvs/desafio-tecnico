/*
 * XML Type:  getProfissoesResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetProfissoesResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getProfissoesResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetProfissoesResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetProfissoesResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetProfissoesResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROFISSOES$0 = 
        new javax.xml.namespace.QName("", "profissoes");
    
    
    /**
     * Gets array of all "profissoes" elements
     */
    public br.jus.tjsc.www.selo.Profissao[] getProfissoesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROFISSOES$0, targetList);
            br.jus.tjsc.www.selo.Profissao[] result = new br.jus.tjsc.www.selo.Profissao[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "profissoes" element
     */
    public br.jus.tjsc.www.selo.Profissao getProfissoesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Profissao target = null;
            target = (br.jus.tjsc.www.selo.Profissao)get_store().find_element_user(PROFISSOES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "profissoes" element
     */
    public int sizeOfProfissoesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROFISSOES$0);
        }
    }
    
    /**
     * Sets array of all "profissoes" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setProfissoesArray(br.jus.tjsc.www.selo.Profissao[] profissoesArray)
    {
        check_orphaned();
        arraySetterHelper(profissoesArray, PROFISSOES$0);
    }
    
    /**
     * Sets ith "profissoes" element
     */
    public void setProfissoesArray(int i, br.jus.tjsc.www.selo.Profissao profissoes)
    {
        generatedSetterHelperImpl(profissoes, PROFISSOES$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "profissoes" element
     */
    public br.jus.tjsc.www.selo.Profissao insertNewProfissoes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Profissao target = null;
            target = (br.jus.tjsc.www.selo.Profissao)get_store().insert_element_user(PROFISSOES$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "profissoes" element
     */
    public br.jus.tjsc.www.selo.Profissao addNewProfissoes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Profissao target = null;
            target = (br.jus.tjsc.www.selo.Profissao)get_store().add_element_user(PROFISSOES$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "profissoes" element
     */
    public void removeProfissoes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROFISSOES$0, i);
        }
    }
}
